package ie.cct.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ie.cct.springboot.models.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
