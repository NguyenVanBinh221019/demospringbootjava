package com.example.demospringbootjava.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
public class BaseDto {
    private Long id;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;
}
