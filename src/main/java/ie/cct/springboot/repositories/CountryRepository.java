package ie.cct.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ie.cct.springboot.models.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
