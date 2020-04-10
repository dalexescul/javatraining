package com.home.javatraining.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends AbstractTemporalEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank()
    @Column(name = "address", nullable = false)
    private String address;

    @NotNull()
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "date_of_death")
    private Date dateOfDeath;

    @NotBlank()
    @Email()
    @Column(name = "email")
    private String email;

    @NotBlank()
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @NotBlank()
    @Column(name = "mobile_no")
    private String mobileNo;

    @NotBlank()
    @Column(name = "residency", nullable = false)
    private String residency;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Account> accounts;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<CustomerHistory> history;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<CustomerHistory> getHistory() {
        return history;
    }
}
