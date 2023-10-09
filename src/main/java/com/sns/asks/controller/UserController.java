package com.sns.asks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class UserController {

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @GetMapping("/login")
    public String signup() {
        return "login";
    }
}
