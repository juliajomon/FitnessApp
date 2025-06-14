package com.Fitness.FitnessApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FitController {

    @GetMapping("/login")
    public String Login(){
        return "index";
    }

    @GetMapping("/signup")
    public String Signup(){
        return "signup";
    }


}
