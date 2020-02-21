package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayalet.tourservice.domain.base.BaseEntity;

import javax.persistence.*;

@Entity
public class BusinessCreditCardInfo extends BaseEntity {
    private String bankName;
    private String branchNo;
    private String accountNo;
    private String iban;
    private String eftCode;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "business_customer_id")
//    public BusinessCustomer businessCustomer;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getEftCode() {
        return eftCode;
    }

    public void setEftCode(String eftCode) {
        this.eftCode = eftCode;
    }

}
