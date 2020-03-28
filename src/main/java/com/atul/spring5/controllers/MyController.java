package com.atul.spring5.controllers;

import com.atul.spring5.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("i18nService") final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String testData() {
        return greetingService.sayGreetings();
    }
 }
