package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Course;
import edu.bootcamp.model.Teacher;

import java.util.List;
import java.util.Set;

public interface IBootcamp {
    public void createBootcamp(Bootcamp bootcamp);
    public double GetTotalHour();
    public List<String> getAllStudent();
    public Set<Course> getAllCourse();
    public Set<Teacher> getAllTeacher();
    public Integer getNumberOfStudent();
}
