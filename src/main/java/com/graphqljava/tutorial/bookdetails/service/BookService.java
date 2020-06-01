package com.graphqljava.tutorial.bookdetails.service;

import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.model.BookInput;

import java.util.List;

public interface BookService {

    public Book getBookById(String id);
    public List<Book> getAllBooks();
    public Book addNewBook(BookInput input);
    public List<Book> getBooksWithAuthor();
}
