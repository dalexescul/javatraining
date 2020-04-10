package com.home.javatraining.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "accounthistory")
public class AccountHistory extends AbstractTemporalEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull()
    @ManyToOne()
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @NotBlank()
    @Column(name = "change_field")
    private String changeField;

    @Column(name = "new_value")
    private String newValue;

    @Column(name = "old_value")
    private String oldValue;

}