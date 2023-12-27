package com.sns.asks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/ask")
    public String ask(){
        return "ask";
    }

    @GetMapping("/answer")
    public String answer(){
        return "answer";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }


    /**
     * 임시
     * @return
     */

    @GetMapping("/interviews")
    public String interview(){
        return "interviews";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
    @GetMapping("/messages")
    public String message(){
        return "interviews";
    }

    @GetMapping("/alarm")
    public String alarm(){
        return "interviews";
    }

    @GetMapping("/setting")
    public String setting(){
        return "interviews";
    }

}
