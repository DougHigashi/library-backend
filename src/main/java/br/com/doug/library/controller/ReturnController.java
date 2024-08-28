package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.Return;
import br.com.doug.library.service.ReturnService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/returns")
public class ReturnController {
    private ReturnService returnService;

    private ReturnController(ReturnService returnService) {
        this.returnService = returnService;
    }

    // POST
    @PostMapping
    public Return create(@RequestBody @Valid Return bookReturn) {
        return returnService.create(bookReturn);
    }

    // GET
    @GetMapping("/{id}")
    public Return get(@PathVariable("id") Long id) {
        return returnService.get(id);
    }

    // PUT
    @PutMapping
    public Return put(@RequestBody Return bookReturn) {
        return returnService.update(bookReturn);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        returnService.delete(id);
    }

}
