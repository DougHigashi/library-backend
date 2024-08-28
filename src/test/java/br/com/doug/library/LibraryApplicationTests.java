package br.com.doug.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.doug.library.entity.User;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class LibraryApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCreateUserSuccess() {
		var user = new User("John Doe", "john@mail.com", "+5511991111190", "97836472121", "xxxxxxxxxxxxxxxxxxxxxxxxx",
				Long.parseLong("2"));

		webTestClient
				.post()
				.uri("/users")
				.bodyValue(user)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$.name").isEqualTo(user.getName())
				.jsonPath("$.email").isEqualTo(user.getEmail())
				.jsonPath("$.phone").isEqualTo(user.getPhone())
				.jsonPath("$.cpf").isEqualTo(user.getCpf());

	}

	@Test
	void testeCreateUserFail() {
		// Creating user without password
		var user = new User("John Doe", "john@mail.com", "+5511991111190", "97836472121", "",
				Long.parseLong("2"));

		webTestClient
				.post()
				.uri("/users")
				.bodyValue(user)
				.exchange()
				.expectStatus().isBadRequest();
	}
}
