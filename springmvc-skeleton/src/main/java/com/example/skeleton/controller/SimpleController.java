package com.example.skeleton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qinwen on 2017/3/7.
 */
@Controller
public class SimpleController {

    @RequestMapping("/simple")
    @ResponseBody
    public String simple() {
        return "Hello world!";
    }

}