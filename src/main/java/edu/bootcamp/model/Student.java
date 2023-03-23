package edu.bootcamp.model;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String id;
    private String name;
    private String username;
    private String email;
    private Set<Bootcamp> bootcampSet = new LinkedHashSet<>();


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

    public Set<Bootcamp> getBootcampSet() {
        return bootcampSet;
    }

    public void setBootcampSet(Set<Bootcamp> bootcampSet) {
        this.bootcampSet = bootcampSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(username, student.username) && Objects.equals(email, student.email) && Objects.equals(bootcampSet, student.bootcampSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, email, bootcampSet);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", bootcampSet=" + bootcampSet +
                '}';
    }
}
