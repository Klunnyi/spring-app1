package ua.klunniy.springcourse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "ua.klunniy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
