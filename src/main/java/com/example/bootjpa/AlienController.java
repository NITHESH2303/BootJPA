package com.example.bootjpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }
    @RequestMapping(/"addAlien")
    public String addAlien(Alien alien){
        return "home.jsp";
    }
}
