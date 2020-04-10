package com.home.javatraining.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Table(name = "account")
@Entity
public class Account extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "balance", nullable = false)
    private Double balance = 0D;

    @NotBlank()
    @Column(name = "currency", nullable = false)
    private String currency;

    @NotNull()
    @ManyToOne()
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "is_restricted", nullable = false)
    private Boolean isRestricted = false;

    @Column(name = "status", nullable = false)
    private Integer status = 1;

    @OneToMany(mappedBy = "account")
    private List<AccountHistory> history;

    public List<AccountHistory> getHistory() {
        return history;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getRestricted() {
        return isRestricted;
    }

    public void setRestricted(Boolean restricted) {
        isRestricted = restricted;
    }
}