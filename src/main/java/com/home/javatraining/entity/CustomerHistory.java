package com.home.javatraining.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customerhistory")
public class CustomerHistory extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "change_field")
    private String changeField;

    @ManyToOne()
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "new_value")
    private String newValue;

    @Column(name = "old_value")
    private String oldValue;

    
}