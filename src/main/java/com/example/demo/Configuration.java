package com.example.demo;

import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public InMemoryHttpTraceRepository httpTraceRepository(){
        return new InMemoryHttpTraceRepository();
    }
}
