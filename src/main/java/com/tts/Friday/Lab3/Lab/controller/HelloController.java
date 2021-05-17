package com.tts.Friday.Lab3.Lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "I am saying hello";
    }



    @GetMapping("/contact")
    public String contact(@RequestParam(name="name",
            required = false,
            defaultValue="World") String name, Integer age, Model model) {
        model.addAttribute("address", "123 Main St.");
        model.addAttribute("name", name);
        model.addAttribute("age", 30);
        return "contact";
    }

}
