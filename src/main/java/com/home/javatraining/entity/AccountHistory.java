package com.home.javatraining.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accounthistory")
public class AccountHistory extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "accountId")
    private String accountId;

    @Column(name = "changeField")
    private String changeField;

    @Column(name = "newValue")
    private String newValue;

    @Column(name = "oldValue")
    private String oldValue;

    
}