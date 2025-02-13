package com.example.dockerapi.controller;

import com.example.dockerapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/users")
    public List<User> getUsers() {
        // モックデータのリストを返す
        return List.of(
            new User(1, "John Doe", "john.doe@example.com")
        );
    }
}