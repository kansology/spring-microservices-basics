package com.kansal.service;

import com.kansal.remote.SimpleFeignClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tarunkansal on 5/1/17.
 */

@Service
public class FeignService {

    private final SimpleFeignClient simpleFeignClient;

    @Autowired
    public FeignService(SimpleFeignClient simpleFeignClient) {
        this.simpleFeignClient = simpleFeignClient;
    }

    public String getName(String name) {
        return simpleFeignClient.getName(name);
    }
}
