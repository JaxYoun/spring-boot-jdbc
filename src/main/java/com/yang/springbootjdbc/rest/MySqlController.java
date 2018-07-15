package com.yang.springbootjdbc.rest;

import com.yang.springbootjdbc.domain.User;
import com.yang.springbootjdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mysql")
public class MySqlController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUserById")
    public User getUserById(Integer id) {
        return this.userRepository.getUserById(id);
    }

}
