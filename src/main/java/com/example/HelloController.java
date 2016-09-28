package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dlin on 9/28/16.
 */

@RestController
public class HelloController {

    @RequestMapping("/h3")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
