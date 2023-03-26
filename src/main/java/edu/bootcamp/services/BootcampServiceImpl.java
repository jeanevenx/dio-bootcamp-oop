package edu.bootcamp.services;

import edu.bootcamp.model.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BootcampServiceImpl implements IBootcamp{
    List<Bootcamp> bootcampList = new ArrayList<>();
    @Override
    public void createBootcamp(Bootcamp bootcamp) {
        bootcampList.add(bootcamp);
    }

    @Override
    public List<Bootcamp> getAllBootcamp() {
        return bootcampList;
    }

    @Override
    public List<Bootcamp> getOneBootcamp(String name) {
        return null;
    }

    @Override
    public double GetTotalHour() {
        Bootcamp course = new Bootcamp();

        double totalOfHour = 0.0;

        for(int i = 0; i <= course.getCourseList().size(); i++){
            totalOfHour += course.getCourseList().iterator().next().getNumberOfHour();
        }
        return totalOfHour;
    }

    @Override
    public List<String> getAllStudent() {
        List<String> studentList = new ArrayList<>();
        Bootcamp student = new Bootcamp();

        for (int i = 0; i <= student.getCourseList().size(); i++) {
            studentList.add(student.getStudentList().iterator().next().getName());
        }

        return studentList;
    }

    @Override
    public List<Course> getAllCourse() {
        Bootcamp course = new Bootcamp();

        return course.getCourseList();
    }

    @Override
    public List<Teacher> getAllTeacher() {
        Bootcamp teacher = new Bootcamp();
        return teacher.getTeacherList();
    }

    @Override
    public Integer getNumberOfStudent() {
        Bootcamp student = new Bootcamp();

        return student.getStudentList().size() + 1;
    }

}
