package com.eridanimelo.sendemail.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.eridanimelo.sendemail.model.Person;

public interface PersonService {

    Page<Person> getAllPersons(Pageable pageable);

    Optional<Person> findPersonByEmail(String email);

    Person createPerson(Person person);

    Person updatePerson(Long id, Person updatedPerson);

    void deletePerson(Long id);

}
