package com.example.blog.repository;

import com.example.blog.model.Posting;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PostingRepository extends JpaRepository<Posting, Integer> {
//    @Query("select title from posting where posting.title=?1")
//    List<Posting> findByTitle(String title);

//    @Query("select title from posting where posting.title=?1")
//    List<Posting> findByTitle(String title, Sort sort);
}
