package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Student;

import java.util.List;

public interface IStudent {
    public  void createStudent(Student student);
    public void enrollBootcamp(Student student, Bootcamp bootcamp);
    public void unenrollBootcamp(String name);
    public List<String> getAllBootcamp();
}
