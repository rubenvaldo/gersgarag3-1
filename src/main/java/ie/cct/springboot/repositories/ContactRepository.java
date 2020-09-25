package ie.cct.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ie.cct.springboot.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
