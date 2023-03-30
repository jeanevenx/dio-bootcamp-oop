package edu.bootcamp.domain;

import java.util.Objects;


public abstract class  Course{
    private String title;
    private String description;
    private double numberOfHour;
    private String status = "unseen";
    private Teacher teacher;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return Double.compare(course.numberOfHour, numberOfHour) == 0
                && Objects.equals(title, course.title)
                && Objects.equals(description, course.description)
                && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, numberOfHour, teacher);
    }

    @Override
    public String toString() {
        return "Course{" +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", numberOfHour=" + numberOfHour +
                ", status=" + status +
                ", teacher=" + teacher +
                '}';
    }
}
