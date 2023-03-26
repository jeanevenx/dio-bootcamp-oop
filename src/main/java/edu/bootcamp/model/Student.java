package edu.bootcamp.model;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String username;
    private String email;
    private List<Bootcamp> bootcampList = new ArrayList<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Bootcamp> getBootcampList() {
        return bootcampList;
    }

    public void setBootcampList(List<Bootcamp> bootcampList) {
        this.bootcampList = bootcampList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", bootcampSet=" + bootcampList +
                '}';
    }
}
