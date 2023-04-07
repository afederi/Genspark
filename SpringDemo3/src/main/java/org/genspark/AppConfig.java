package org.genspark;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration//All bean configurations are in this AppConfig class
@ComponentScan(basePackages = "org.genspark")
public class AppConfig {
}
