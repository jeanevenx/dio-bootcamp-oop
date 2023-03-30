package edu.bootcamp.domain;



import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String name;
    private String description;
    private String category;
    private final LocalDate beginning = LocalDate.now();
    private final LocalDate duration = beginning.plusDays(90);

    private Set<Course> courseSet = new LinkedHashSet<>();
    private Set<String> studentSet = new HashSet<>();

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

    public LocalDate getDuration() {
        return duration;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Set<String> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<String> studentSet) {
        this.studentSet = studentSet;
    }


    public void setTeacherSet(Set<String> teacherSet) {
        for(Course course: this.getCourseSet()){

            teacherSet.add(course.getTeacher().getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description)
                && Objects.equals(category, bootcamp.category)
                && Objects.equals(beginning, bootcamp.beginning)
                && Objects.equals(duration, bootcamp.duration)
                && Objects.equals(courseSet, bootcamp.courseSet)
                && Objects.equals(studentSet, bootcamp.studentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, category, beginning, duration, courseSet, studentSet);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", beginning=" + beginning +
                ", duration=" + duration +
                ", courseSet=" + courseSet +
                ", studentSet=" + studentSet +
                '}';
    }
}
