package com.hms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {

    @GetMapping(value="/")
    public String rootMap(){

        return "Hello Checker, This is Banna. U here for check Vaccine module";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){

        return "Hello testURL!";
    }
}
