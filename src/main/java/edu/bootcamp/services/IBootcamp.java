package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Course;
import edu.bootcamp.model.Teacher;

import java.util.List;

public interface IBootcamp {
    public void createBootcamp(Bootcamp bootcamp);
    public List<String> getAllStudent();
    public List<Course> getAllCourse();
    public List<Teacher> getAllTeacher();
    public Integer getNumberOfStudent();
}
