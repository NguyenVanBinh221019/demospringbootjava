package com.example.demospringbootjava.service;

import com.example.demospringbootjava.dto.NewDto;
import com.example.demospringbootjava.entity.New;

import java.util.List;

public interface NewService {
    NewDto save(NewDto newDto);
    NewDto update(NewDto newDto);
    String delete (Long id);
    NewDto getById(Long id);

}
