package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testAddTaskToDoList(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = applicationContext.getBean(Board.class);
        //When
        board.addToDoList("Zadanie do zrobienia (nr 1)");
        String result = board.getToDoList().getTasks().get(0);
        //Then
        Assert.assertEquals("Zadanie do zrobienia (nr 1)", result);
    }
    @Test
    public void testAddTaskInProgressList(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = applicationContext.getBean(Board.class);
        //When
        board.addInProgressList("Zadanie w trakcie realizacji (nr 1)");
        String result = board.getInProgressList().getTasks().get(0);
        //Then
        Assert.assertEquals("Zadanie w trakcie realizacji (nr 1)", result);
    }
    @Test
    public void testAddTaskDoneList(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = applicationContext.getBean(Board.class);
        //When
        board.addDoneList("Zadanie ukończone (nr 1)");
        String result = board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("Zadanie ukończone (nr 1)",result);
    }
}
