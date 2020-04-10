package com.home.javatraining.manager;

import com.home.javatraining.entity.AbstractTemporalEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractManager<T> {

    public T find(String id) {
        return this.getRepository().getOne(id);
    }

    public Page<T> findAll(int offset, int limit) {
        return this.getRepository().findAll(PageRequest.of(offset, limit));
    }

    public T createOne(T instance) {
        return this.getRepository().saveAndFlush(instance);
    }

    public T save(T instance) {
        return this.getRepository().saveAndFlush(instance);
    }

    public abstract T updateOne(T oldInstance, T updateData);

    public abstract JpaRepository<T, String> getRepository();
}
