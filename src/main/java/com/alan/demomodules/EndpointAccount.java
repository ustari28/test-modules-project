package com.alan.demomodules;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class EndpointAccount {

    @RequestMapping(method = RequestMethod.GET, value = "/account")
    public String account() {
        return "Account";
    }
}
