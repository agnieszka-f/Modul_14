package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addToTasks(String task){
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
