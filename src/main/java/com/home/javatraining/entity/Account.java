package com.home.javatraining.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "account")
@Entity
public class Account extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "balance", nullable = false)
    private Double balance = 0D;

    @Column(name = "currency", nullable = false)
    private String currency;

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
}