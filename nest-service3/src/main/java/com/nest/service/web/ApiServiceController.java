package com.nest.service.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botter
 */
@RestController
@RequestMapping("/")
public class ApiServiceController {

    @RequestMapping(value = "/hi")
    public String service1() {
        return "it is my second service!";
    }
}
