package com.nest.service.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author botter
 */
@FeignClient(value = "nest-service")
public interface ConsumerServiceInterface {

    @RequestMapping(value = "/hi")
    String hi();
}
