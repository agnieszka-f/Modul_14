package com.kodilla.hibernate.tasklist;

import javax.persistence.*;

@Entity
@Table(name="TASKSLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    public TaskList(){

    }
    @Column(name="ID", unique = true)
    @GeneratedValue
    @Id
    public int getId() {
        return id;
    }
    @Column(name="LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
