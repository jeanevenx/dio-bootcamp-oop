package edu.bootcamp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String id;
    private String name;
    private String description;
    private String category;
    private Set<Course> courses = new LinkedHashSet<>();
    private LocalDate beginning;
    private LocalDate duration;




    public  void enrollment(Student student){

    }

    public String getId() {
        return id;
    }

    public void setId() {

        double randomNumber = Math.random();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
        String formatDateTime = now.format(format);

        this.id = "ID:" + randomNumber + formatDateTime + this.getName();
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
}
