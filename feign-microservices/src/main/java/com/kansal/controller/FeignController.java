package com.kansal.controller;

import com.kansal.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tarunkansal on 5/1/17.
 */

@RestController
@RequestMapping("/feign")
public class FeignController {

    private final FeignService feignService;

    @Autowired
    public FeignController(FeignService feignService) {
        this.feignService = feignService;
    }

    @RequestMapping(method= RequestMethod.GET, value = "/hello/{name}")
    public String feignHello(@PathVariable("name") String name) {
        return feignService.getName(name);
    }
}
