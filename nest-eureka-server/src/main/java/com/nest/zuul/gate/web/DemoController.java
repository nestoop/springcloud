package com.nest.zuul.gate.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @RequestMapping(value = "/demo")
    public String demo() {
        return "hello demo zuul";
    }
}
