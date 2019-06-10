package com.example.blog;

import com.example.blog.model.Posting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void postingCreateTest(){
        Posting posting = new Posting();
    }

}
