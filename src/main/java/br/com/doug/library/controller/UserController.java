package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.User;
import br.com.doug.library.service.UserService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // POST
    @PostMapping
    public User post(@RequestBody @Valid User user) {
        return userService.create(user);
    }

    // GET
    @GetMapping("/{id}")
    public User get(@PathVariable("id") Long id) {
        return userService.get(id);
    }

    // PUT
    @PutMapping
    public User put(@RequestBody User user) {
        return userService.update(user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}
