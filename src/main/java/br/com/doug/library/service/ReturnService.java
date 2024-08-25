package br.com.doug.library.service;

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

    public Return get(Long id) {
        var bookReturn = returnRepository.findById(id);

        return bookReturn.get();
    }

    public Return update(Return returnEntity) {
        return returnRepository.save(returnEntity);
    }

    public void delete(Long id) {
        returnRepository.deleteById(id);
    }
}
