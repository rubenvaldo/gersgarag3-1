package ie.cct.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ie.cct.springboot.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
