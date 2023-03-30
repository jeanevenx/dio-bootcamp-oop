package edu.bootcamp.domain;

public class Teacher {
    private String name;
    private String courseName;
    private String company;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", course name='" + courseName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
