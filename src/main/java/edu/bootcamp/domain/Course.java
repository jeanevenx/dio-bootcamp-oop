package edu.bootcamp.domain;

import java.util.Objects;

public abstract class  Course{
    private String id;
    private String title;
    private String description;
    private double numberOfHour;
    private Teacher teacher;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNumberOfHour() {
        return numberOfHour;
    }

    public void setNumberOfHour(double numberOfHour) {
        this.numberOfHour = numberOfHour;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Double.compare(course.numberOfHour, numberOfHour) == 0 && Objects.equals(id, course.id) && Objects.equals(title, course.title) && Objects.equals(description, course.description) && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, numberOfHour, teacher);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", numberOfHour=" + numberOfHour +
                ", teacher=" + teacher +
                '}';
    }
}
