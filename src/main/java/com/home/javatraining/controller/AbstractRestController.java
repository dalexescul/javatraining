package com.home.javatraining.controller;

import com.home.javatraining.entity.AbstractTemporalEntity;
import com.home.javatraining.manager.AbstractManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public abstract class AbstractRestController {

    @GetMapping("/")
    public @ResponseBody List<AbstractTemporalEntity> getAllPaginated() {
        return this.getManager().findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody AbstractTemporalEntity getOne(@PathVariable String id) {
        return this.getManager().getOne(id);
    }

    public abstract AbstractManager getManager();

}
