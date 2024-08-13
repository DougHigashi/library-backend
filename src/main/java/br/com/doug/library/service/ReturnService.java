package br.com.doug.library.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.Return;
import br.com.doug.library.repository.ReturnRepository;

@Service
public class ReturnService {
    private ReturnRepository returnRepository;

    public ReturnService(ReturnRepository returnRepository) {
        this.returnRepository = returnRepository;
    }

    public Return create(Return returnEntity) {
        return returnRepository.save(returnEntity);
    }

    public Optional<Return> get(Long id) {
        return returnRepository.findById(id);
    }

    public Return update(Return returnEntity) {
        return returnRepository.save(returnEntity);
    }

    public void delete(Long id) {
        returnRepository.deleteById(id);
    }
}
