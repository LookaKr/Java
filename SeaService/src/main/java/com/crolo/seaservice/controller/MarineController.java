package com.crolo.seaservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarineController {

    @GetMapping("/marine")
    public String getMainPage (){
        return "mainMarine";
    }
}
