package com.graphqljava.tutorial.bookdetails.service;

import com.graphqljava.tutorial.bookdetails.model.Author;
import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.model.BookInput;
import com.graphqljava.tutorial.bookdetails.repository.AuthorRepository;
import com.graphqljava.tutorial.bookdetails.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceJpa implements BookService{

    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private AuthorRepository authorRepo;

    @Override
    public Book getBookById(String bookId){
        return bookRepo.findById(bookId).orElse(null);
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    @Override
    public List<Book> getBooksWithAuthor(){
        return bookRepo.findAll();
    }

    @Override
    public Book addNewBook(BookInput input){
        Book book = new Book(input);
        Author author = authorRepo.findById(input.getAuthorId()).orElse(null);
        if (author == null){
            // create new author
        }
        book.setAuthor(author);
        List<Book> books = bookRepo.findAll();
        book.setId("book-"+(books.size()+1));
        bookRepo.save(book);
        return book;
    }

}