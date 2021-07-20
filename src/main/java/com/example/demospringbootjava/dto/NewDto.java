package com.example.demospringbootjava.dto;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class NewDto extends BaseDto{
    private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;

    private String categoryCode;

}
