package com.nest.sleuth.web;

import com.nest.sleuth.service.SleuthService1;
import com.nest.sleuth.service.SleuthService2;
import com.nest.sleuth.service.SleuthService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botter
 */
@RestController
@RequestMapping("/sleuth")
public class SleuthController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SleuthService1.class);

    @Autowired
    private SleuthService1 sleuthService1;
    @Autowired
    private SleuthService2 sleuthService2;
    @Autowired
    private SleuthService3 sleuthService3;

    @RequestMapping(value = "/demo")
    public String service1() {
        log.info("[SleuthController] request service1");
        return sleuthService1.service();
    }

    @RequestMapping(value = "/demo2")
    public String service2() {
        log.info("[SleuthController] request service2");
        return sleuthService2.service();
    }

    @RequestMapping(value = "/demo3")
    public String service3() {
        log.info("[SleuthController] request service3");
        return sleuthService3.service();
    }


}
