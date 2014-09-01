package no.javabin.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main, args)
    }
}