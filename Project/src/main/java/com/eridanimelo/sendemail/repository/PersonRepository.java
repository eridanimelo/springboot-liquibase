package com.eridanimelo.sendemail.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eridanimelo.sendemail.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByEmail(String email);

}
