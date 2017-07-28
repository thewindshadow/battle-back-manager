package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bing.Z on 2017/7/28.
 */
@Controller
public class test {

    @RequestMapping(value = "test")
    public String test(){
        return "login";
    }
}
