package com.asmr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcome {



//    @ResponseBody//json所有返回json数据
    @RequestMapping("/index")
    public  String welcome(){
        String a = "hello word";
        System.out.println("hello word!");

        return "index";
    }



}
