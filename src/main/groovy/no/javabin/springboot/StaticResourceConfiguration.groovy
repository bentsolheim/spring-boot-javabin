package no.javabin.springboot

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter


@Configuration
class StaticResourceConfiguration extends WebMvcConfigurerAdapter {

    @Override
    void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler('/custom/**').addResourceLocations('file:/Users/bent/projects/spring-boot-javabin/src/main/resources/not_exposed_by_default/')
    }
}
