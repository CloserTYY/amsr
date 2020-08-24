package com.asmr.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jumpTest {


    @RequestMapping("/jumplogin")
    public String jumplogin(){
        return "login";
    }

}
