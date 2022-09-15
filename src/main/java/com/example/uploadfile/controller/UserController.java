package com.example.uploadfile.controller;

import com.example.uploadfile.UserDTO;
import com.example.uploadfile.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("register")
    public ResponseEntity<String> registerUser(@ModelAttribute UserDTO userDTO){
        registrationService.registerUser(userDTO);
        return new ResponseEntity<>("User registered successfully.", HttpStatus.CREATED);
    }
}
