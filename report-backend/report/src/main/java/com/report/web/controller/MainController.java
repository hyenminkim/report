package com.report.web.controller;

import com.report.web.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    MainService mainService;
    @GetMapping("/home")
    public  void home(Model model){

        model.addAttribute("list",mainService.list());


    }


}
