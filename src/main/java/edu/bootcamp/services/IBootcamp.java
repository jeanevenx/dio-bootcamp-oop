package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Course;
import edu.bootcamp.model.Teacher;

import java.util.List;
import java.util.Set;

public interface IBootcamp {
    public void createBootcamp(Bootcamp bootcamp);
    public List<Bootcamp> getAllBootcamp();
    public List<Bootcamp> getOneBootcamp(String name);
    public double GetTotalHour();
    public List<String> getAllStudent();
    public List<Course> getAllCourse();
    public List<Teacher> getAllTeacher();
    public Integer getNumberOfStudent();
}
