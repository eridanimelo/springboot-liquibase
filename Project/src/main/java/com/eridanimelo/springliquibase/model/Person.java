package com.eridanimelo.springliquibase.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")
@SequenceGenerator(name = "seq_person", sequenceName = "seq_person", initialValue = 1, allocationSize = 1)
@Schema(description = "Details of a Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person")
    @Schema(description = "The unique ID")
    private Long id;

    @Column(nullable = false, length = 100)
    @Schema(description = "The name of the Person", example = "Jhon", required = true)
    private String name;

    @Column(nullable = false, unique = true)
    @Schema(description = "The email of the Person", example = "jhon@gmail.com", required = true)
    private String email;

    @Column(nullable = false, length = 15)
    @Schema(description = "The phone of the Person", example = "+55 9999-99999")
    private String phone;

    public Person() {
    }

    public Person(Long id) {
        this.id = id;
    }

}
