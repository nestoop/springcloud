package com.nest.sleuth.service;

import org.springframework.stereotype.Service;

/**
 * @author botter
 */
@Service
public class SleuthService2 {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SleuthService1.class);

    public String service() {
        log.info("[service1] SleuthService2 method service");
        return "service2";
    }
}
