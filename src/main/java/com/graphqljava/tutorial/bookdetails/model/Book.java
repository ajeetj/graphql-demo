package com.graphqljava.tutorial.bookdetails.model;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Book {

    private String id;
    private String name;
    private Integer pageCount;
    private String authorId;
    private Author author;

    public Book(String id, String name, Integer pageCount, String authorId ){
        this.id=id;
        this.name=name;
        this.pageCount=pageCount;
        this.authorId=authorId;
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
        this.authorId=input.getAuthorId();
    }
}
