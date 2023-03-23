package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Course;

import java.util.List;

public interface IBootcamp {
    public void createBootcamp(Bootcamp bootcamp);
    public List<String> getAllStudent();
    public List<Course> getAllCourse();
    public Integer getNumberOfStudent();
}
