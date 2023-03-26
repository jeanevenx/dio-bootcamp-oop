package edu.bootcamp.domain;

import edu.bootcamp.utility.IDUtil;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private String id;
    private String name;
    private String description;
    private String category;
    private LocalDate beginning;
    private LocalDate duration;

    private List<Course> courseList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();

    public Bootcamp() {
        this.id = IDUtil.uniqueID(this.getName());
    }



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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalDate beginning) {
        this.beginning = beginning.now();
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", beginning=" + beginning +
                ", duration=" + duration +
                ", courseList=" + courseList +
                ", studentList=" + studentList +
                ", teacherList=" + teacherList +
                '}';
    }



}
