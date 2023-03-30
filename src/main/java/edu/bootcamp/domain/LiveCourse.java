package edu.bootcamp.domain;

import java.time.LocalDateTime;

public class LiveCourse extends Course{
    private LocalDateTime date;
    private String platform;
    private String link;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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

    @Override
    public String toString() {
        return "LiveCourse{" +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", numberOfHour='" + getNumberOfHour() +
                ", status='" + getStatus() +
                ", teacher='" + getTeacher() +
                ", date=" + date +
                ", platform='" + platform + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
