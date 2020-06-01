package com.graphqljava.tutorial.bookdetails.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Author {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName){
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
