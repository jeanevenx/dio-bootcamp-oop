package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Student;

import java.util.List;
import java.util.Set;

public interface IStudent {
    public void enrollBootcamp(int bootcampIndex, List<Student> student);
    public void unenrollBootcamp(int bootcampIndex);
    public Set<String> getAllBootcamp();
}
