package com.graphqljava.tutorial.bookdetails.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqljava.tutorial.bookdetails.model.Comment;
import com.graphqljava.tutorial.bookdetails.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private CommentService commentService;

    public Comment getCommentById(Integer id) {
        return commentService.getCommentById(id);
    }

    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

}
