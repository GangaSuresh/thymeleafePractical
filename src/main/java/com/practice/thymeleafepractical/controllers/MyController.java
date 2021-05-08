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
        m.addAttribute("isActive",false);
        m.addAttribute("gender","F");
        List<Integer> list=List.of(233);
        m.addAttribute("mylist",list);
        return "condition";
    }

    //handler for including fragments
    @GetMapping("/service")
    public String serviceHandler(Model m){
        m.addAttribute("title","Ganga");
        m.addAttribute("subtitle",21);
        return "service";
    }

    //handler for inheriting
    @GetMapping("/newabout")
    public String newAbout(Model m){
        System.out.println("here");

        return "aboutnew";
    }

}
