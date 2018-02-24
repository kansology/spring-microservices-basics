package com.kansal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by tarunkansal on 2/24/18.
 */
@RestController
public class AuthController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
