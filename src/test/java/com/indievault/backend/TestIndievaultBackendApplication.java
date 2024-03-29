package com.indievault.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestIndievaultBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(IndievaultBackendApplication::main).with(TestIndievaultBackendApplication.class).run(args);
    }

}
