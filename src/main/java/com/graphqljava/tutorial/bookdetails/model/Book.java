package com.graphqljava.tutorial.bookdetails.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Book {

    @Id
    private String id;
    private String name;
    private Integer pageCount;

    @ManyToOne(targetEntity = Author.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", referencedColumnName = "id", insertable = true, updatable = true)
    private Author author;

    public Book(String id, String name, Integer pageCount, String authorId ){
        this.id=id;
        this.name=name;
        this.pageCount=pageCount;
    }

    public Book(String id, String name, Integer pageCount, Author author ){
        this.id=id;
        this.name=name;
        this.pageCount=pageCount;
        this.author=author;
    }

    public Book(BookInput input){
        this.name=input.getName();
        this.pageCount=input.getPageCount();
    }
}
