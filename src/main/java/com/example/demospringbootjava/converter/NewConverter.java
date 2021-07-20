package com.example.demospringbootjava.converter;

import com.example.demospringbootjava.dto.NewDto;
import com.example.demospringbootjava.entity.New;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {
    public New toNew(NewDto newDto) {
        New news = new New();
        news.setTitle(newDto.getTitle());
        news.setContent(newDto.getContent());
        news.setThumbnail(newDto.getThumbnail());
        news.setShortDescription(newDto.getShortDescription());

        return news;
    }

    public NewDto toNewDto(New news) {
        NewDto newDto = new NewDto();

        if (news.getId() != null) {
            newDto.setId(news.getId());
        }

        newDto.setContent(news.getContent());
        newDto.setThumbnail(news.getThumbnail());
        newDto.setTitle(news.getTitle());
        newDto.setShortDescription(news.getShortDescription());
        newDto.setCreateBy(news.getCreatedBy());
        newDto.setCreateDate(news.getCreatedDate());
        newDto.setModifiedBy(news.getModifiedBy());
        newDto.setModifiedDate(news.getModifiedDate());

        return newDto;
    }

    public New toNew(NewDto newDto, New news) {
        news.setTitle(newDto.getTitle());
        news.setContent(newDto.getContent());
        news.setThumbnail(newDto.getThumbnail());
        news.setShortDescription(newDto.getShortDescription());

        return news;
    }

}
