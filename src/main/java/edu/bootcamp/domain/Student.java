package edu.bootcamp.domain;


import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String id;
    private String name;
    private String username;
    private String email;
    private Set<String> bootcampEnrolled = new LinkedHashSet<>();
    private Set<String> bootcampCompleted = new LinkedHashSet<>();


    public void enrollBootcamp(Bootcamp bootcamp){
        this.bootcampEnrolled.add(bootcamp.getName());
        bootcamp.getStudentSet().add(this.name);
    }

    public void makeCourse(Course course){
        boolean status =course.getStatus().equals("unseen");

        if(status){
            course.setStatus("seen");
        }
    }
    public  void progress(Bootcamp bootcamp){
        boolean isCompleted = false;
        String status = bootcamp.getCourseSet().iterator().next().getStatus();

        while(bootcamp.getCourseSet().iterator().hasNext()){
            if(status.equals("seen")){
                isCompleted = true;
            } else {
                isCompleted = false;
            }
        }

        if (isCompleted){
            bootcampCompleted.add(bootcamp.getName());
        }
    }


    public String getId() {
        return id;
    }

    public final void setId(String id) {
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
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(username, student.username) && Objects.equals(email, student.email) && Objects.equals(bootcampEnrolled, student.bootcampEnrolled) && Objects.equals(bootcampCompleted, student.bootcampCompleted);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, username, email, bootcampEnrolled, bootcampCompleted);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", bootcampEnrolled=" + bootcampEnrolled +
                ", bootcampCompleted=" + bootcampCompleted +
                '}';
    }
}
