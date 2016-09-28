package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dlin on 9/28/16.
 */
//@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Hello.class);
    }

}