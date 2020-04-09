package com.home.javatraining.manager;

import com.home.javatraining.entity.AbstractTemporalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractManager {

    public AbstractTemporalEntity getOne(String id) {
        return (AbstractTemporalEntity) this.getRepository().getOne(id);
    }

    public List<AbstractTemporalEntity> findAll() {
        return this.getRepository().findAll();
    }

    public abstract JpaRepository getRepository();
}
