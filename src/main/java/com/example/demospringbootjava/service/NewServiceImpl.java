package com.example.demospringbootjava.service;

import com.example.demospringbootjava.converter.NewConverter;
import com.example.demospringbootjava.dto.NewDto;
import com.example.demospringbootjava.entity.Category;
import com.example.demospringbootjava.entity.New;
import com.example.demospringbootjava.repository.CategoryRepository;
import com.example.demospringbootjava.repository.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewServiceImpl implements NewService{

    @Autowired
     NewRepository newRepository;

    @Autowired
     CategoryRepository categoryRepository;

    @Autowired
     NewConverter newConverter;

    @Override
    public NewDto save( NewDto newDto) {
        New news = newConverter.toNew(newDto);
        Category category = categoryRepository.findByCode(newDto.getCategoryCode());
        news.setCategory(category);
        newRepository.save(news);

        return newConverter.toNewDto(news);
    }

    @Override
    public NewDto update(NewDto newDto) {
        New news = newRepository.findByid(newDto.getId());
        New newEntity = newConverter.toNew(newDto, news);
        Category category = categoryRepository.findByCode(newDto.getCategoryCode());
        newEntity.setCategory(category);
        newRepository.save(newEntity);
        return newConverter.toNewDto(newEntity);
    }

    @Override
    public String delete(Long id) {
        New news = newRepository.findByid(id);
        newRepository.delete(news);
        return "delete success";
    }

    public NewDto getById(Long id) {
        New news = newRepository.findByid(id);
        NewDto newDto = newConverter.toNewDto(news);
        return  newDto;
    }





}
