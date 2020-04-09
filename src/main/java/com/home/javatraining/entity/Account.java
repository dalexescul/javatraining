package com.home.javatraining.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "account")
@Entity
public class Account extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "balance", nullable = false)
    private Double balance = 0D;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "ownerId")
    private String ownerId;

    @Column(name = "restrictionFlag", nullable = false)
    private Integer restrictionFlag = 1;

    @Column(name = "status", nullable = false)
    private Integer status = 1;

    
}