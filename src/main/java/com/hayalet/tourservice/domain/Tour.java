package com.hayalet.tourservice.domain;

import com.hayalet.tourservice.domain.base.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Tour extends BaseEntity {
    private String name;
    private String fromWhere;
    private String toWhere;
    private LocalDateTime createDateTime;
    private String description;
    private String tourType;
    private Long travelTimeByHours;
    private String features;
    private String excludeFeatures;
    private String startDatetime;
    private String endDatetime;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "tour_id")
    private List<Rate> rates;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "tour_id")
    private List<TourVehicle> tourVehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public String getToWhere() {
        return toWhere;
    }

    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public Long getTravelTimeByHours() {
        return travelTimeByHours;
    }

    public void setTravelTimeByHours(Long travelTimeByHours) {
        this.travelTimeByHours = travelTimeByHours;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getExcludeFeatures() {
        return excludeFeatures;
    }

    public void setExcludeFeatures(String excludeFeatures) {
        this.excludeFeatures = excludeFeatures;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }
}
