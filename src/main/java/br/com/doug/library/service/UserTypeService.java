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

    public void create(UserType userType) {
        userTypeRepository.save(userType);
    }
}
