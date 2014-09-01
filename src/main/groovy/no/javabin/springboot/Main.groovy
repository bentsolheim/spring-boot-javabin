package no.javabin.springboot

import no.javabin.springboot.domain.User
import no.javabin.springboot.repos.UserRepository
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Main, args)
        UserRepository userRepository = applicationContext.getBean(UserRepository)

        userRepository.save(new User(firstName: 'Bent', lastName: 'Solheim', email: 'bent@kodehuset.no'))
        userRepository.save(new User(firstName: 'Jaran', lastName: 'Nilsen', email: 'jaran@kodehuset.no'))
    }
}