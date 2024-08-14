package br.com.doug.library.service;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.User;
import br.com.doug.library.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User get(Long id) {
        var user = userRepository.findById(id);

        return user.get();
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}