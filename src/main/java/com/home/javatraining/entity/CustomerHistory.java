package com.home.javatraining.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "customerhistory")
public class CustomerHistory extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "changeField")
    private String changeField;

    @Column(name = "customerId")
    private String customerId;

    @Column(name = "newValue")
    private String newValue;

    @Column(name = "oldValue")
    private String oldValue;

    
}