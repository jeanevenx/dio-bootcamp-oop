package edu.bootcamp.domain;

import edu.bootcamp.utility.IDUtil;

public class RecordedCourse extends Course {


    public RecordedCourse() {
        this.setId(IDUtil.uniqueID(this.getTitle()));
    }


}
