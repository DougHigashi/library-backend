package br.com.doug.library.service;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.Borrow;
import br.com.doug.library.repository.BorrowRepository;

@Service
public class BorrowService {
    private BorrowRepository borrowRepository;

    public BorrowService(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }

    public Borrow get(Long id) {
        var borrow = borrowRepository.findById(id);

        return borrow.get();
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
