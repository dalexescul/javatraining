package com.home.javatraining.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.javatraining.manager.AbstractManager;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public abstract class AbstractRestController<T> {

    @GetMapping("/")
    public @ResponseBody Page<T> getAllPaginated(@RequestParam int firstPage, @RequestParam int itemsPerPage) {
        return this.getManager().findAll(firstPage,itemsPerPage);
    }

    @GetMapping("/{id}")
    public @ResponseBody T getOne(@PathVariable String id) {
        return this.getManager().find(id);
    }

    @PostMapping("/")
    public @ResponseBody T createOne(@RequestBody String json) {
        T instance = this.deserialize(json);

        return this.getManager().createOne(instance);
    }

    @PutMapping("/{id}")
    public @ResponseBody T updateOne(@PathVariable String id, @RequestBody String json) {
        T updateData = this.deserialize(json);
        T oldInstance = this.getManager().find(id);

        return this.getManager().updateOne(oldInstance, updateData);
    }

    protected T deserialize(String json) {
        T result = null;
        try {
            result = new ObjectMapper().readValue(json, this.getEntityClass());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }

    public abstract AbstractManager<T> getManager();

    public abstract Class<T> getEntityClass();

}
