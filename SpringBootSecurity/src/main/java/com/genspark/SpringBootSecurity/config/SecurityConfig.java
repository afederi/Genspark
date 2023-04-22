package com.genspark.SpringBootSecurity.config;

//import com.genspark.SpringBootSecurity.service.SecurityUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


public class SecurityConfig{



    @Bean
    public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}


    public UserDetailsService userDetailService() {


    }


    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails adminUser = User.withUsername("admin")
                .password(passwordEncoder().encode("AdminPassword"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(adminUser);
    }





    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/home/admin")
                .hasRole("ADMIN")
                .requestMatchers("/home/public")
                .permitAll()
                .requestMatchers("/home")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
        return httpSecurity.build();
    }


}
