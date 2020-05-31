package com.graphqljava.tutorial.bookdetails.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public Book getBookById(String id) {
        return bookService.getBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public List<Book> getBooksWithAuthor(){
        return bookService.getBooksWithAuthor();
    }

}
