package com.graphqljava.tutorial.bookdetails.service;

import com.google.common.collect.ImmutableMap;
import com.graphqljava.tutorial.bookdetails.model.Author;
import com.graphqljava.tutorial.bookdetails.model.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class BookServiceImpl implements BookService{

    private List<Map<String, String>> books = Arrays.asList(
            ImmutableMap.of("id", "book-1",
                    "name", "Harry Potter and the Philosopher's Stone",
                    "pageCount", "223",
                    "authorId", "author-1"),
            ImmutableMap.of("id", "book-2",
                    "name", "Moby Dick",
                    "pageCount", "635",
                    "authorId", "author-2"),
            ImmutableMap.of("id", "book-3",
                    "name", "Interview with the vampire",
                    "pageCount", "371",
                    "authorId", "author-3")
    );

    private Map<String, Author> authors = new HashMap<String, Author>() {{
        put("author-1", new Author("author-1",
                "Joanne", "Rowling"));
        put("author-2", new Author("author-2",
                "Herman", "Melville"));
        put("author-3", new Author("author-3",
                "Anne", "Rice"));

    }};


    @Override
    public Book getBookById(String bookId){
        return books.stream()
            .map(b -> new Book(b.get("id"),b.get("name"),Integer.valueOf(b.get("pageCount")),b.get("authorId")))
            .filter(b -> b.getId().equals(bookId))
            .findFirst().orElse(null);
    }

    @Override
    public List<Book> getAllBooks(){
        return books
                .stream()
                .map(b -> new Book(b.get("id"),b.get("name"),Integer.valueOf(b.get("pageCount")),b.get("authorId")))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getBooksWithAuthor(){
        return books
                .stream()
                .map(b -> new Book(b.get("id"),b.get("name"),Integer.valueOf(b.get("pageCount")),authors.get(b.get("authorId"))))
                .collect(Collectors.toList());
    }

    @Override
    public Book addNewBook(Book book){
        book.setId("book-"+(books.size()+1));
//        Map<String, String> newBook = ImmutableMap.of("id", book.getId(),
//                    "name", book.getName(),
//                    "pageCount", book.getPageCount().toString(),
//                    "authorId", book.getAuthorId());
//            books.add(newBook);
        return book;
    }
}
