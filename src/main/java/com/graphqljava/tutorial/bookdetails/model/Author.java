package com.graphqljava.tutorial.bookdetails.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Author {

    private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName){
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
