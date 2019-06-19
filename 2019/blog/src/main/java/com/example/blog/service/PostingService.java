package com.example.blog.service;

import com.example.blog.model.Posting;
import com.example.blog.repository.PostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingService {

    @Autowired
    private PostingRepository postingRepository;

    public void create(Posting posting) {
        postingRepository.save(posting);
    }

    public List<Posting> list() {
        return (List<Posting>) postingRepository.findAll();
    }

    public Posting get(Integer number) {
        return postingRepository.findById(number).orElse(null);
    }

    public void update(Posting posting) {
        postingRepository.save(posting);
    }

    public void delete(Integer number) {
        postingRepository.deleteById(number);
    }

//    public List<Posting> getTitle(String title) {
//        return (List<Posting>) postingRepository.findByTitle(title, Sort.by(title));
//    }


}
