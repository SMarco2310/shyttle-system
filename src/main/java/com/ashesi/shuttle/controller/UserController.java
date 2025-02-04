package com.ashesi.shuttle.controller;

import com.ashesi.shuttle.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping


public class UserController {


    private UserService userService;
}
