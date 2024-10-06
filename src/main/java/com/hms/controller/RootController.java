package com.hms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {

    @GetMapping(value="/")
    public String rootMap(){

        return "https://documenter.getpostman.com/view/38439166/2sAXxMgtnT";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){

        return "Hello testURL!";
    }
}
