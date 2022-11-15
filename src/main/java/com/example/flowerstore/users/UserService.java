package com.example.flowerstore.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<MyUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(MyUser user) {
        userRepository.save(user);
    }
}
