package com.nest.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botter
 */
@RestController
@RequestMapping("/")
public class WebController {

    @RequestMapping("/test")
    public String get(){
        return null;
    }
}
