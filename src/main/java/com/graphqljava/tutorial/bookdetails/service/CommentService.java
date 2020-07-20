package com.graphqljava.tutorial.bookdetails.service;

import com.graphqljava.tutorial.bookdetails.model.Book;
import com.graphqljava.tutorial.bookdetails.model.BookInput;
import com.graphqljava.tutorial.bookdetails.model.Comment;

import java.util.List;

public interface CommentService {

    public Comment getCommentById(Integer id);
    public List<Comment> getAllComments();
    public Comment addNewComment(String input);
    public void deleteComment(Integer commentId);
}
