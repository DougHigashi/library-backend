package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.Borrow;
import br.com.doug.library.service.BorrowService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/borrows")
public class BorrowController {
    private BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    // POST
    @PostMapping
    public Borrow create(@RequestBody @Valid Borrow borrow) {
        return borrowService.create(borrow);
    }

    // GET
    @GetMapping("/{id}")
    public Borrow get(@PathVariable("id") Long id) {
        return borrowService.get(id);
    }

    // PUT
    @PutMapping
    public Borrow put(@RequestBody Borrow borrow) {
        return borrowService.update(borrow);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        borrowService.delete(id);
    }
}
