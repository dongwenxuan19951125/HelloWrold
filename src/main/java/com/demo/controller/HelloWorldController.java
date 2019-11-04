package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping("/sayhello")
    @ResponseBody
    public String helloworld(){

        System.out.println(new Date().toString());
        System.out.println("Hello world！");
        System.out.println(": )");

        return "Hello world!";
    }




}
