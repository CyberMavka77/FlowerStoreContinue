package com.example.flowerstore.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public List<MyUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(MyUser user) {
        if (userRepository.findMyUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
