package com.challenge.login.api;


import com.challenge.login.applogin.Login;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {
    @RequestMapping (value = "/login")
    public Login getId(){

        return new Login(true);
    }
    }

