package no.javabin.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@EnableAutoConfiguration
class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main, args)
    }
}