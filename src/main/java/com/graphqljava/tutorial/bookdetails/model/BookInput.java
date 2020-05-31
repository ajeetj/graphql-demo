package com.graphqljava.tutorial.bookdetails.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput {
    private String name;
    private Integer pageCount;
    private String authorId;
}
