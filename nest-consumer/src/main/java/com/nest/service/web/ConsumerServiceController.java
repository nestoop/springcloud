package com.nest.service.web;

import com.nest.service.interfaces.ConsumerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botter
 */
@RestController
@RequestMapping("/service")
public class ConsumerServiceController {

    @Autowired
    ConsumerServiceInterface consumerServiceInterface;

    @RequestMapping(value = "/demo")
    public String service() {
        return consumerServiceInterface.hi();
    }
}
