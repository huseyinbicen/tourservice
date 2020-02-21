package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayalet.tourservice.domain.base.BaseEntity;

import javax.persistence.*;

@Entity
public class MyCard extends BaseEntity {
    private String customerNote;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "personal_customer_id")
//    private PersonalCustomer personalCustomer;

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

}
