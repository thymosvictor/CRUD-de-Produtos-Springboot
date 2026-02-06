package com.bootcampjava.springapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // permite todos os endpoints
                        .allowedOrigins("https://frontendproduto.vercel.app") // seu frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowCredentials(true);
            }
        };
    }
}
