package one.digital.innovation.personapi.repository;

import one.digital.innovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
