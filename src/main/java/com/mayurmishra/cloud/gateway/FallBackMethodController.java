package com.mayurmishra.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project - cloud-gateway
 * Created By MAYUR on 02/08/22
 */
@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod() {
        return "User service is not Available" +
                " Please try again after some time.";
    }

    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod() {
        return "Department service is not Available" +
                " Please try again after some time.";
    }
}
