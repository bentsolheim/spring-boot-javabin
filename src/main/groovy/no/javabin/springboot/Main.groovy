package no.javabin.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@EnableAutoConfiguration
@ComponentScan
@Controller
class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main, args)
    }


    @RequestMapping("/")
    @ResponseBody
    String handle() {

        "<h1>Hello World</h1>"
    }
}