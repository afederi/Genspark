package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //This class will contain the beans configuration
@ComponentScan(basePackages = "org.genspark")
public class AppConfig {

//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new MediaTek();
//    }
}
