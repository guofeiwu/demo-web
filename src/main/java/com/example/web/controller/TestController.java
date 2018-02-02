package com.example.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author guofei_wu
 * @Date 2017/9/12 13:33
 */
@Controller
@RequestMapping(value = "/admin/test")
public class TestController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String testStr(){
        return "test2";
    }
}
