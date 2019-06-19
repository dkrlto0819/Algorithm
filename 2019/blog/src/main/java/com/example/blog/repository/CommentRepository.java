package com.example.blog.repository;

import com.example.blog.model.Comment;
import com.example.blog.model.Posting;
import net.bytebuddy.TypeCache;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
