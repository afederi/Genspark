package com.genspark.SecurityDemo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/home/public")// When a user has these parameters in their url, then
                .permitAll()
                .anyRequest()
                .and()
                .formLogin();


        return httpSecurity.build();
    }


}
