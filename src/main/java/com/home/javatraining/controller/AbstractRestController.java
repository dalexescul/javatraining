package com.home.javatraining.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.javatraining.entity.AbstractTemporalEntity;
import com.home.javatraining.manager.AbstractManager;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public abstract class AbstractRestController {

    @GetMapping("/")
    public @ResponseBody Page<AbstractTemporalEntity> getAllPaginated(@RequestParam int firstPage, @RequestParam int itemsPerPage) {
        return this.getManager().findAll(firstPage,itemsPerPage);
    }

    @GetMapping("/{id}")
    public @ResponseBody AbstractTemporalEntity getOne(@PathVariable String id) {
        return this.getManager().find(id);
    }

    @PostMapping("/")
    public @ResponseBody AbstractTemporalEntity createOne(@RequestBody String json) {
        AbstractTemporalEntity instance = this.deserialize(json);

        return this.getManager().createOne(instance);
    }

    @PutMapping("/{id}")
    public @ResponseBody AbstractTemporalEntity updateOne(@PathVariable String id, @RequestBody String json) {
        AbstractTemporalEntity updateData = this.deserialize(json);
        AbstractTemporalEntity oldInstance = this.getManager().find(id);

        return this.getManager().updateOne(oldInstance, updateData);
    }

    protected AbstractTemporalEntity deserialize(String json) {
        AbstractTemporalEntity result = null;
        try {
            result = (AbstractTemporalEntity) new ObjectMapper().readValue(json, this.getEntityClass());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }

    public abstract AbstractManager getManager();

    public abstract Class getEntityClass();

}
