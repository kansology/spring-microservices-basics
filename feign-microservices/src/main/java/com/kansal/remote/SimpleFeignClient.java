package com.kansal.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tarunkansal on 5/1/17.
 */

@FeignClient(value = "simple-microservice")
public interface SimpleFeignClient {

    @RequestMapping(value = "/simple/hello/{name}")
    public String getName(@PathVariable("name") String name);
}
