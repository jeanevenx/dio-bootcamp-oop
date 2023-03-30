package edu.bootcamp.domain;


import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Student {
    private String name;
    private String username;
    private String email;
    private Set<String> bootcampEnrolled = new LinkedHashSet<>();
    private Set<String> bootcampCompleted = new LinkedHashSet<>();


    public void enrollBootcamp(@NotNull Bootcamp bootcamp){
        this.bootcampEnrolled.add(bootcamp.getName());
        bootcamp.getStudentSet().add(this.name);
    }

    public void makeCourse(@NotNull Course course){
        boolean status =course.getStatus().equals("unseen");

        if(status){
            course.setStatus("seen");
        }
    }
    public  void progress(@NotNull Bootcamp bootcamp){
        List<String> courseStatus = new ArrayList<>();

        for(Course status: bootcamp.getCourseSet()){
            courseStatus.add(status.getStatus());
            }

        boolean isCompleted = courseStatus.stream()
                .allMatch(status -> status.equals("seen"));

        if (isCompleted){
            bootcampCompleted.add(bootcamp.getName());
        }
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

    public Set<String> getBootcampEnrolled() {
        return bootcampEnrolled;
    }

    public void setBootcampEnrolled(Set<String> bootcampEnrolled) {
        this.bootcampEnrolled = bootcampEnrolled;
    }

    public Set<String> getBootcampCompleted() {
        return bootcampCompleted;
    }

    public void setBootcampCompleted(Set<String> bootcampCompleted) {
        this.bootcampCompleted = bootcampCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(username, student.username)
                && Objects.equals(email, student.email)
                && Objects.equals(bootcampEnrolled, student.bootcampEnrolled)
                && Objects.equals(bootcampCompleted, student.bootcampCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, username, email, bootcampEnrolled, bootcampCompleted);
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", bootcampEnrolled=" + bootcampEnrolled +
                ", bootcampCompleted=" + bootcampCompleted +
                '}';
    }
}
