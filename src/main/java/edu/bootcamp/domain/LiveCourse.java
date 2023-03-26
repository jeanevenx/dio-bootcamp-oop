package edu.bootcamp.domain;

import edu.bootcamp.utility.IDUtil;

import java.time.LocalDate;

public class LiveCourse extends Course{
    private LocalDate date;
    private String platform;
    private String link;

    public LiveCourse() {
        this.setId(IDUtil.uniqueID(this.getTitle()));
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
