package com.hayalet.tourservice.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hayalet.tourservice.domain.base.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class PersonalCustomer extends BaseEntity {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String username;
    @NotNull
    private String mail;
    @NotNull
    private String password;
    @NotNull
    private String phone;
    private String city;
    private String district;
    private String detailAddress;

    @NotNull
    private LocalDate birthday;

    @NotNull
    private Boolean gender;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "personal_customer_id")
    private List<MyCard> myCards;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "personal_customer_id")
    private List<PersonalCreditCardInfo> personalCreditCardInfos;

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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public List<MyCard> getMyCards() {
        return myCards;
    }

    public void setMyCards(List<MyCard> myCards) {
        this.myCards = myCards;
    }

    public List<PersonalCreditCardInfo> getPersonalCreditCardInfos() {
        return personalCreditCardInfos;
    }

    public void setPersonalCreditCardInfos(List<PersonalCreditCardInfo> personalCreditCardInfos) {
        this.personalCreditCardInfos = personalCreditCardInfos;
    }
}
