package com.example.blog.service;

import com.example.blog.model.Comment;
import com.example.blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void create(Comment comment) {
        commentRepository.save(comment);
    }

    public List<Comment> list() {
        return (List<Comment>) commentRepository.findAll();
    }

    public Comment get(Integer number) {
        return commentRepository.findById(number).orElse(null);
    }

    public void update(Comment comment) {
        commentRepository.save(comment);
    }

    public void delete(Integer number) {
        commentRepository.deleteById(number);
    }
}
