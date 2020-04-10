package com.home.javatraining.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "accounthistory")
public class AccountHistory extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne()
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @Column(name = "change_field")
    private String changeField;

    @Column(name = "new_value")
    private String newValue;

    @Column(name = "old_value")
    private String oldValue;

}