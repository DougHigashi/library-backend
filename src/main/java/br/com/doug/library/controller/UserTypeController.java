package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.UserType;
import br.com.doug.library.service.UserTypeService;

@RestController
@RequestMapping("/user_types")
public class UserTypeController {

    private UserTypeService userTypeService;

    public UserTypeController(UserTypeService userTypeService) {
        this.userTypeService = userTypeService;
    }

    // POST
    @PostMapping
    public String createTypes() {
        userTypeService.create(new UserType(Long.parseLong("1"), "Admin"));
        userTypeService.create(new UserType(Long.parseLong("2"), "Reader"));
        return "User types created in database!";
    }
}
