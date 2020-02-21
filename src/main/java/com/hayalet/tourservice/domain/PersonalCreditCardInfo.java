package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayalet.tourservice.domain.base.BaseEntity;

import javax.persistence.*;

@Entity
public class PersonalCreditCardInfo extends BaseEntity {
    private String cardNo;
    private String date;
    private String cvv;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "personal_customer_id")
//    PersonalCustomer personalCustomer;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
