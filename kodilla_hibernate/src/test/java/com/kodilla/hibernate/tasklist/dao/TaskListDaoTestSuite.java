package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void test1(){
        //Given
        TaskList toDo = new TaskList("To do","Lista zadań do zrobienia");
        TaskList inProgress = new TaskList("In progress","Lista zadań w trakcie realizacji");
        TaskList done = new TaskList("Done","Lista zakończonych zadań");
        //When
        taskListDao.save(toDo);
        taskListDao.save(inProgress);
        taskListDao.save(done);

        String listName1 = toDo.getListName();
        String listName2 = inProgress.getListName();
        String listName3 = done.getListName();

        List<TaskList> list1 = taskListDao.findByListName(listName1);
        List<TaskList> list2 = taskListDao.findByListName(listName2);
        List<TaskList> list3 = taskListDao.findByListName(listName3);

        //Then
        Assert.assertFalse(list1.isEmpty());
        Assert.assertFalse(list2.isEmpty());
        Assert.assertFalse(list3.isEmpty());

        //Clean
        taskListDao.deleteAll();
    }
}
