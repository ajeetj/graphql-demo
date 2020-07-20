package com.graphqljava.tutorial.bookdetails.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;

    public Comment(Integer id, String text){
        this.id=id;
        this.text=text;
    }

    public Comment(String input){
        this.text=input;
    }
}
