package com.ibm.springmvc.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestIndexController {
    
    @GetMapping("/rest")
    public String index() {
        return "/rest/index";
    }
}
