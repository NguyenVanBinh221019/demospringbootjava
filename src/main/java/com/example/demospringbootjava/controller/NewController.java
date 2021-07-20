package com.example.demospringbootjava.controller;

import com.example.demospringbootjava.dto.NewDto;
import com.example.demospringbootjava.entity.New;
import com.example.demospringbootjava.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NewController {

    @Autowired
    NewService newService;

    @PostMapping("/new")
    public NewDto create(@RequestBody NewDto newDto) {
        return newService.save(newDto);
    }

    @PutMapping("/new/{id}")
    public NewDto updateNew(@RequestBody NewDto newDto, @PathVariable long id) {
        newDto.setId(id);
        return newService.update(newDto);
    }

    @DeleteMapping("/new/{id}")
    public void deleteNew( @PathVariable Long id) {
         newService.delete(id);
    }

    @GetMapping("/new/{id}")
    public NewDto getAll(@PathVariable Long id) {
        return newService.getById(id);
    }
}
