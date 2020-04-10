package com.home.javatraining.manager;

import com.home.javatraining.entity.AbstractTemporalEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractManager {

    public AbstractTemporalEntity find(String id) {
        return (AbstractTemporalEntity) this.getRepository().getOne(id);
    }

    public Page<AbstractTemporalEntity> findAll(int offset, int limit) {
        return this.getRepository().findAll(PageRequest.of(offset, limit));
    }

    public AbstractTemporalEntity createOne(AbstractTemporalEntity instance) {
        return (AbstractTemporalEntity) this.getRepository().saveAndFlush(instance);
    }

    public AbstractTemporalEntity save(AbstractTemporalEntity instance) {
        return (AbstractTemporalEntity) this.getRepository().saveAndFlush(instance);
    }

    public abstract AbstractTemporalEntity updateOne(AbstractTemporalEntity oldInstance, AbstractTemporalEntity updateData);

    public abstract JpaRepository getRepository();
}
