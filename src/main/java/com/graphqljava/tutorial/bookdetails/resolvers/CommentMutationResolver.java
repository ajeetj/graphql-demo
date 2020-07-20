package com.graphqljava.tutorial.bookdetails.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqljava.tutorial.bookdetails.model.Comment;
import com.graphqljava.tutorial.bookdetails.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private CommentService commentService;

    public Comment addComment(String input){
        return commentService.addNewComment(input);
    }

    public String deleteComment(Integer id){
        commentService.deleteComment(id);
        return "Success";
    }
}