package edu.bootcamp;

import edu.bootcamp.domain.*;

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        //BOOTCAMP Available
        Bootcamp bootJava = new Bootcamp();
        bootJava.setName("Java Developer");
        bootJava.setDescription("Learn Java from scratch");
        bootJava.setCategory("Back-end Development");

        Bootcamp bootJs = new Bootcamp();
        bootJs.setName("Master Javascript");
        bootJs.setDescription("Learn Javascript from scratch");
        bootJs.setCategory("Fullstack");

        //TEACHERS
        Teacher algoTeacher = new Teacher();
        algoTeacher.setName("algo teacher name");
        algoTeacher.setCourseName("Algorithms and computational thinking");
        algoTeacher.setCompany("Facebook");

        Teacher javaTeacher = new Teacher();
        javaTeacher.setName("Java teacher name");
        javaTeacher.setCourseName("Java fundamentals");
        javaTeacher.setCompany("Google");

        //COURSES - Java bootcamp
        Course recordedCourseAlgo = new RecordedCourse();
        recordedCourseAlgo.setTitle("Algorithms and computational thinking");
        recordedCourseAlgo.setDescription("Learn how to think and pass instruction to the computer");
        recordedCourseAlgo.setNumberOfHour(6.5);
        recordedCourseAlgo.setTeacher(algoTeacher);

        Course recordedCourseJava = new RecordedCourse();
        recordedCourseJava.setTitle("Java fundamentals");
        recordedCourseJava.setDescription("A description for this java course");
        recordedCourseJava.setNumberOfHour(5);
        recordedCourseJava.setTeacher(javaTeacher);

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

        Student student2 = new Student();
        student2.setName("Joshua John");
        student2.setUsername("joshua");
        student2.setEmail("Joshua@gmail.com");

        Student student3 = new Student();
        student3.setName("Carl Max");
        student3.setUsername("carl");
        student3.setEmail("carl@gmail.com");


        Set<Course> courses = new LinkedHashSet<>();
        courses.add(recordedCourseAlgo);
        courses.add(liveCourse);
        courses.add(recordedCourseJava);
        bootJava.setCourseSet(courses);

        student1.enrollBootcamp(bootJava);
        student1.makeCourse(recordedCourseAlgo);
        student1.makeCourse(liveCourse);
        student1.makeCourse(recordedCourseJava);
        student1.progress(bootJava);

        student1.enrollBootcamp(bootJs);
        System.out.println(student1);

        student2.enrollBootcamp(bootJava);
        student3.enrollBootcamp(bootJava);




        System.out.println(bootJava);
        System.out.println(bootJava.getStudentSet());
        System.out.println(bootJava.getCourseSet());

    }
}