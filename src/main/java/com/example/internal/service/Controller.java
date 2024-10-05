package com.example.internal.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class Controller {

    @GetMapping( "/get_string")
    public String getFromInternal() {
        return "Internal service " + Calendar.getInstance().getTime();
    }
}
