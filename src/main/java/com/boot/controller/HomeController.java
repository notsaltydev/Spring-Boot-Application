package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam on 05.05.2016.
 */
@RestController
public class HomeController {

    //prosba o odwzorowanie naszego głównego URL

    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
