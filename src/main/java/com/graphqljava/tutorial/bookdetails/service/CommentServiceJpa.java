package com.graphqljava.tutorial.bookdetails.service;

import com.graphqljava.tutorial.bookdetails.model.Comment;
import com.graphqljava.tutorial.bookdetails.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommentServiceJpa implements CommentService{

    @Autowired
    private CommentRepository commentRepo;


    @Override
    public Comment getCommentById(Integer commentId){
        return commentRepo.findById(commentId).orElse(null);
    }

    @Override
    public List<Comment> getAllComments(){
        return commentRepo.findAll(Sort.by(Sort.Order.desc("id")));
    }

    @Override
    public Comment addNewComment(String input){
        Comment comment = new Comment(input);
        commentRepo.save(comment);
        return comment;
    }

    @Override
    public void deleteComment(Integer commentId){
        commentRepo.deleteById(commentId);
    }

}