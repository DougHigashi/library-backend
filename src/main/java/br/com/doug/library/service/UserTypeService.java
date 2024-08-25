package br.com.doug.library.service;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.UserType;
import br.com.doug.library.repository.UserTypeRepository;

@Service
public class UserTypeService {
    private UserTypeRepository userTypeRepository;

    public UserTypeService(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    public UserType get(Long id) {
        var userType = userTypeRepository.findById(id);

        return userType.get();
    }

    public UserType create(UserType userType) {
        return userTypeRepository.save(userType);
    }

    public UserType update(UserType userType) {
        return userTypeRepository.save(userType);
    }

    public void delete(Long id) {
        userTypeRepository.deleteById(id);
    }
}
