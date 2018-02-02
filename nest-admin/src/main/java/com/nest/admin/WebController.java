package com.nest.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botter
 */
@RestController
@RequestMapping("/")
public class WebController {

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WebController.class);

    @RequestMapping("/test")
    public String test(){
        logger.info("[Controller] test method...");
        return "test";
    }
}
