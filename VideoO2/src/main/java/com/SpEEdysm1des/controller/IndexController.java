package com.SpEEdysm1des.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("streaming")
public class IndexController {
    @GetMapping
    public String index() {
        return "index";
    }
}
