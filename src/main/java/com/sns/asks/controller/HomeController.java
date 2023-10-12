package com.sns.asks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/message")
    public String message(){
        return "main";
    }

    @GetMapping("/alarm")
    public String alarm(){
        return "main";
    }

    @GetMapping("/setting")
    public String setting(){
        return "main";
    }

}
