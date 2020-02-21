package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayalet.tourservice.domain.base.BaseEntity;
import javax.persistence.*;

@Entity
public class Vehicle extends BaseEntity {
    private String brand;
    private String model;
    private String year;
    private Long capacity;
    private Long costByKm;
    private String type;
    private String plaque;
    private Byte[] picture;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getCostByKm() {
        return costByKm;
    }

    public void setCostByKm(Long costByKm) {
        this.costByKm = costByKm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte[] getPicture() {
        return picture;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public void setPicture(Byte[] picture) {
        this.picture = picture;
    }

}
