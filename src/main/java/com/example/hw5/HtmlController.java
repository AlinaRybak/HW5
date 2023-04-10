package com.example.hw5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @GetMapping("/view")
    public String htmlView(){

        return "index.html";
    }
}
