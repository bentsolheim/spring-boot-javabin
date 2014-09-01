package no.javabin.springboot.rest

import no.javabin.springboot.domain.User
import no.javabin.springboot.repos.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.web.bind.annotation.RequestMethod.GET

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    UserRepository userRepository


    @RequestMapping(value = "/", method = GET)
    List<User> list() {

        userRepository.findAll()
    }
}
