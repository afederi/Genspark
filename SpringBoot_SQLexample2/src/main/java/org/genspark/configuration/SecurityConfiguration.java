package org.genspark.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {


    /**
     *
     * This password encoder will function when it exists in the program.
     * Since the password encoder is here, you need to encode your password inputs
     * If the password encoder is not in here, then the default password and credentials will work no problem
     *
     */
    @Bean
    public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}

    /**
     * At this point, the userDetailsService() is what is used to list all users for authentication. The default password in the console will not show anymore
     * @return
     */
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails adminUser = User
//                .withUsername("normal")
//                .password(passwordEncoder().encode("normal"))
//                .roles("NORMAL")
//                .build();
//
//
//
//        return new InMemoryUserDetailsManager(adminUser);
//
//    }



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity h) throws Exception{
        h.csrf().disable()
                .authorizeHttpRequests()//This is the method that will allow you to add security for your http/url requests
                .requestMatchers("/normal")
                .hasAnyAuthority("NORMAL","ADMIN")
                .requestMatchers("/admin")
                .hasAuthority("ADMIN")
                .requestMatchers("/")
                .permitAll()
                .anyRequest()//Unless specified, all url pages will fall under anyRequests(). You would need to specify the type of security such as permit all or authentication for it to work. Think firewalls where the last rules deny all packets
                .authenticated()// Won't allow you to view the page unless you have the right credentials
                .and()
                .formLogin()//This will  provide you with a default login page unless you customize it
                .and()
                .httpBasic();//A different style of login. In case the formLogin() page isn't working, this will run.

        return h.build();
    }

}
