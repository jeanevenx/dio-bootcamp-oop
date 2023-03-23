package edu.bootcamp.model;

import edu.bootcamp.utility.IDUtil;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String id;
    private String name;
    private String description;
    private String category;
    private LocalDate beginning;
    private LocalDate duration;

    private Set<Course> courseSet = new LinkedHashSet<>();
    private Set<Student> studentSet = new HashSet<>();
    private Set<Teacher> teacherSet = new HashSet<>();

    public Bootcamp() {
        this.id = IDUtil.uniqueID(this.getName());
    }



    public  void enrollment(Student student){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalDate beginning) {
        this.beginning = beginning;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(id, bootcamp.id)
                && Objects.equals(name, bootcamp.name)
                && Objects.equals(description, bootcamp.description) && Objects.equals(category, bootcamp.category)
                && Objects.equals(beginning, bootcamp.beginning) && Objects.equals(duration, bootcamp.duration)
                && Objects.equals(courseSet, bootcamp.courseSet) && Objects.equals(studentSet, bootcamp.studentSet)
                && Objects.equals(teacherSet, bootcamp.teacherSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, category, beginning, duration, courseSet, studentSet, teacherSet);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", beginning=" + beginning +
                ", duration=" + duration +
                ", courseSet=" + courseSet +
                ", studentSet=" + studentSet +
                ", teacherSet=" + teacherSet +
                '}';
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }
}
