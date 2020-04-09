package com.home.javatraining.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@MappedSuperclass()
public abstract class AbstractTemporalEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", insertable = false, nullable = false)
    private String id;

    public String getId() {
        return id;
    }
}
