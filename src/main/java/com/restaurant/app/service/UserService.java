package com.restaurant.app.service;

import com.restaurant.app.entity.User;
import com.restaurant.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Long registerUser(User user) {
        //user.setPassword(new BCryptPasswordEncoder().encode(password));
        userRepository.save(user);
        return user.getId();
    }
}
