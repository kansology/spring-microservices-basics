package com.kansal.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

/**
 * Created by tarunkansal on 5/1/17.
 */

@RestController
@RequestMapping("/simple")
public class SimpleMicroserviceController {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
