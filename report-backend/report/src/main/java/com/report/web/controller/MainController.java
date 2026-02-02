package com.report.web.controller;

import com.report.web.domain.Tk_framek;
import com.report.web.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class MainController {

    @Autowired
    MainService mainService;
    @GetMapping("/api/home")
    public List<Tk_framek> home(Model model){

        return mainService.list();


    }


}
