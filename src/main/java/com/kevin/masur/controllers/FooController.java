package com.kevin.masur.controllers;

import com.kevin.masur.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/foo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class FooController {

    @Autowired
    private FooService fooService;

    @RequestMapping(method = RequestMethod.POST)
    public void create() {
        
    }
}
