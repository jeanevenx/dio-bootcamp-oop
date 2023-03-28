package edu.bootcamp;

import edu.bootcamp.domain.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        //BOOTCAMP Available
        Bootcamp bootJava = new Bootcamp();
        bootJava.setName("Java Developer");
        bootJava.setDescription("Learn Java from scratch");
        bootJava.setCategory("Back-end Development");

        //TEACHERS
        Teacher algoTeacher = new Teacher();
        algoTeacher.setName("algo teacher name");
        algoTeacher.setCourseName("Algorithms and computational thinking");
        algoTeacher.setCompany("Facebook");

        //COURSES
        Course recordedCourseAlgo = new RecordedCourse();
        recordedCourseAlgo.setTitle("Algorithms and computational thinking");
        recordedCourseAlgo.setDescription("Learn how to think and pass instruction to the computer");
        recordedCourseAlgo.setNumberOfHour(6.5);
        recordedCourseAlgo.setTeacher(algoTeacher);

        LiveCourse liveCourse = new LiveCourse();
        liveCourse.setTitle("How to think like a machine");
        liveCourse.setDescription("In this class we'll learn the computational thinking");
        liveCourse.setPlatform("ZOOM");
        liveCourse.setNumberOfHour(2d);
        liveCourse.setDate(LocalDate.of(2023,04,15).atTime(2,30,0));
        liveCourse.setLink("Join us on this amazing live");
        liveCourse.setTeacher(algoTeacher);

        // STUDENTS
        Student student1 = new Student();
        student1.setName("Jean Evenx");
        student1.setUsername("evnx");
        student1.setEmail("jean@gmail.com");


        Set<Course> courses = new LinkedHashSet<>();
        courses.add(recordedCourseAlgo);
        courses.add(liveCourse);
        bootJava.setCourseSet(courses);
        student1.enrollBootcamp(bootJava);

        System.out.println(bootJava);

    }
}