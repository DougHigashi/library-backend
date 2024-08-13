package br.com.doug.library.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.Borrow;
import br.com.doug.library.repository.BorrowRepository;

@Service
public class BorrowService {
    private BorrowRepository borrowRepository;

    public BorrowService(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }

    public Optional<Borrow> get(Long id) {
        return borrowRepository.findById(id);
    }

    public Borrow create(Borrow borrow) {
        return borrowRepository.save(borrow);
    }

    public Borrow update(Borrow borrow) {
        return borrowRepository.save(borrow);
    }

    public void delete(Long id) {
        borrowRepository.deleteById(id);
    }
}
