package no.javabin.springboot.repos

import no.javabin.springboot.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAllByEmail(String email)
}
