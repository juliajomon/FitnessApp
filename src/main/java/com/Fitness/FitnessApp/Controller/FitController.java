package com.Fitness.FitnessApp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FitController {

    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @GetMapping("/home")
    public String home(){
        return "tracker";
    }

    @GetMapping("/signup")
    public String Signup(){
        return "signup";
    }


}
