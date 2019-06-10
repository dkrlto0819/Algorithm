package com.example.blog.controller;

import com.example.blog.model.Comment;
import com.example.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public void create(@RequestBody Comment comment){
        commentService.create(comment);
    }

    @GetMapping
    public List<Comment> list(){
        return commentService.list();
    }

    @GetMapping("/{number}")
    public Comment get(@PathVariable Integer number){
        return commentService.get(number);
    }

    @PutMapping
    public void update(@RequestBody Comment comment){
        commentService.update(comment);
    }

    @DeleteMapping("/{number}")
    public void delete(@PathVariable Integer number){
        commentService.delete(number);
    }
}
