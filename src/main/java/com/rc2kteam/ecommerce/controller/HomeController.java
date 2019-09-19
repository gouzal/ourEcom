package com.rc2kteam.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HomeController
 */
@Controller
public class HomeController {

//    @GetMapping("/")
//    public String index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
@GetMapping("/aa")
public String index() {
    return "google";
}
}