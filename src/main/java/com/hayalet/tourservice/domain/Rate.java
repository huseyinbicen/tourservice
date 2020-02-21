package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayalet.tourservice.domain.base.BaseEntity;

import javax.persistence.*;

@Entity
public class Rate extends BaseEntity {
    private Integer start;
    private String  comment;

   // private Tour tours;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
