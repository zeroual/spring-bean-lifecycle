package com.zenika;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zenika")
@PropertySource("classpath:/app.properties")
public class AppConfig {

    @Bean
    public Bar bar() {
        return new Bar();
    }

}
