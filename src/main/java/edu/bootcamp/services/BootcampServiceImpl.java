package edu.bootcamp.services;

import edu.bootcamp.model.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BootcampServiceImpl implements IBootcamp{
    List<Bootcamp> bootcampSet = new ArrayList<>();
    @Override
    public void createBootcamp(Bootcamp bootcamp) {
        bootcampSet.add(bootcamp);
    }

    @Override
    public List<Bootcamp> getAllBootcamp() {
        return bootcampSet;
    }

    @Override
    public List<Bootcamp> getOneBootcamp(String name) {
        return null;
    }

    @Override
    public double GetTotalHour() {
        Bootcamp course = new Bootcamp();

        double totalOfHour = 0.0;

        for(int i = 0; i <= course.getCourseSet().size(); i++){
            totalOfHour += course.getCourseSet().iterator().next().getNumberOfHour();
        }
        return totalOfHour;
    }

    @Override
    public List<String> getAllStudent() {
        List<String> studentList = new ArrayList<>();
        Bootcamp student = new Bootcamp();

        for (int i = 0; i <= student.getStudentSet().size(); i++) {
            studentList.add(student.getStudentSet().iterator().next().getName());
        }

        return studentList;
    }

    @Override
    public Set<Course> getAllCourse() {
        Bootcamp course = new Bootcamp();

        return course.getCourseSet();
    }

    @Override
    public Set<Teacher> getAllTeacher() {
        Bootcamp teacher = new Bootcamp();
        return teacher.getTeacherSet();
    }

    @Override
    public Integer getNumberOfStudent() {
        Bootcamp student = new Bootcamp();

        return student.getStudentSet().size();
    }

}
