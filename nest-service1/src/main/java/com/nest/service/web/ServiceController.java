package com.nest.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author botter
 */
@RestController
@RequestMapping("/")
public class ServiceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hi")
    public String service() {
        List<String> services = discoveryClient.getServices();
        services.forEach(s -> System.out.println(s));
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        System.out.println(localServiceInstance.getHost() + " : port = " + localServiceInstance.getPort());
        return "it is my first service!";
    }
}
