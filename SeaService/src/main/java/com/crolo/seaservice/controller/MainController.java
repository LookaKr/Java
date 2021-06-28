package com.crolo.seaservice.controller;

import com.crolo.seaservice.dao.postgresqlQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final postgresqlQueries query;

    @Autowired
    public MainController(final postgresqlQueries query){
        this.query = query;
    }


    @GetMapping("/desktop")
    public String getMainPage (){
        return "main";
    }
}
