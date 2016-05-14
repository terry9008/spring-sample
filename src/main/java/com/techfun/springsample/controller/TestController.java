package com.techfun.springsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author luzhengfu
 */
@Controller
@RequestMapping("index")
public class TestController {

    @RequestMapping("home")
    @ResponseBody
    public String index(){
        return "hello";
    }
}
