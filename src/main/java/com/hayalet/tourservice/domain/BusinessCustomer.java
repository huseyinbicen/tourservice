package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hayalet.tourservice.domain.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BusinessCustomer extends BaseEntity {

    private String firstName;
    private String lastName;
    private String companyName;
    private String identityNo;
    private String username;
    private String mail;
    private String password;
    private String phone;
    private String city;
    private String district;
    private String detailAddress;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "business_customer_id")
    private List<BusinessCreditCardInfo> businessCreditCardInfo;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "business_customer_id")
    private List<Tour> tours;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "business_customer_id")
    private List<Vehicle> vehicles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public List<BusinessCreditCardInfo> getBusinessCreditCardInfo() {
        return businessCreditCardInfo;
    }

    public void setBusinessCreditCardInfo(List<BusinessCreditCardInfo> businessCreditCardInfo) {
        this.businessCreditCardInfo = businessCreditCardInfo;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
