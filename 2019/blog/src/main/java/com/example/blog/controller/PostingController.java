package com.example.blog.controller;


import com.example.blog.model.Posting;
import com.example.blog.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posting")
public class PostingController {
    @Autowired
    private PostingService postingService;

    @PostMapping
    public void create(@RequestBody Posting posting){
        postingService.create(posting);
    }

    @GetMapping
    public List<Posting> list(){
        return postingService.list();
    }

    @GetMapping("/{number}")
    public Posting get(@PathVariable Integer number){
        return postingService.get(number);
    }

    @PutMapping
    public void update(@RequestBody Posting posting){
        postingService.update(posting);
    }

    @DeleteMapping("/{number}")
    public void delete(@PathVariable Integer number){
        postingService.delete(number);
    }

//    @PostMapping("/{title}")
//    public List<Posting> getTitle(@PathVariable String title) { return postingService.getTitle(title); }
}



