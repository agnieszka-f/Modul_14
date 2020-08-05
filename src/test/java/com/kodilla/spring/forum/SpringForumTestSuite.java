package com.kodilla.spring.forum;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringForumTestSuite {
    @Test
    public void ForumUserTestSuite(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = applicationContext.getBean(ForumUser.class);
        //When
        String result = forumUser.username;
        //Then
        Assert.assertEquals("John Smith", result);
    }
}
