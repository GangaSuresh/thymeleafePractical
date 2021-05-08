package com.practice.thymeleafepractical.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class MyController {
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model){
        System.out.println("Inside about handler");

        //creating a model
        model.addAttribute("name","Ganga");
        model.addAttribute("currentDate",new Date().toLocaleString());
        return "about"; //returns about.html
    }

    //for iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model m){
        //create a list for testing-all iterables
        List<String> list=List.of("A","B","C","D");
        m.addAttribute("names",list);
        return "iterate";
    }

    //handler for conditional statements
    @GetMapping("/condition")
    public String conditionalHandler(Model m){
        System.out.println("conditional handler executed..");
        return "condition";
    }
}
