package com.graphqljava.tutorial.bookdetails.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.model.BookInput;
import com.graphqljava.tutorial.bookdetails.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BookService bookService;

    public Book addBook(BookInput bookInput){
        return bookService.addNewBook(bookInput);
    }
}