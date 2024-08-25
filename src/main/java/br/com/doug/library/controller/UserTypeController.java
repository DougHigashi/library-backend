package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.User;
import br.com.doug.library.entity.UserType;
import br.com.doug.library.service.UserTypeService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/user_types")
public class UserTypeController {

    private UserTypeService userTypeService;

    public UserTypeController(UserTypeService userTypeService) {
        this.userTypeService = userTypeService;
    }

    // POST
    @PostMapping
    public UserType create(@RequestBody UserType userType) {
        return userTypeService.create(userType);
    }

    // GET
    @GetMapping("/{id}")
    public UserType get(@PathVariable("id") Long id) {
        return userTypeService.get(id);
    }

    // PUT
    @PutMapping
    public UserType put(@RequestBody UserType userType) {
        return userTypeService.update(userType);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        userTypeService.delete(id);
    }
}
