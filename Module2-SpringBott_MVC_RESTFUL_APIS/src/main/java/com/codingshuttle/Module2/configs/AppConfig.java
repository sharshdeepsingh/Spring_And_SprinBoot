package com.codingshuttle.Module2.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class AppConfig {
    @Bean
 public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
