package com.bootcamp.storage01.service;

import com.bootcamp.storage01.model.User;
import com.bootcamp.storage01.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User addNewUser(User user) {
        return repo.save(user);
    }

    public Optional<User> findById(long cod) {
        return repo.findById(cod);
    }

    public User updateUser(User user) {
        return repo.save(user);
    }

    public void deleteUser(long cod) {
        repo.deleteById(cod);
    }
}
