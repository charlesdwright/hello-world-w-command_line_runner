package com.spring.helloworldwcommandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class HelloWorldWCommandlinerunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldWCommandlinerunnerApplication.class, args); }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {

            System.out.println("Inspect the beans provided");
            String[] beanNames=ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName: beanNames) {
                System.out.println(beanName);
            }

        };

    }

}
