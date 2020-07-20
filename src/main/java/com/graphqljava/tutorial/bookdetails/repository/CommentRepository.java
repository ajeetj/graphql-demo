package com.graphqljava.tutorial.bookdetails.repository;

import com.graphqljava.tutorial.bookdetails.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
