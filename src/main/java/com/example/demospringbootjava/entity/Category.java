package com.example.demospringbootjava.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category extends BaseEntity{
    private String code;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<New> news = new ArrayList<>();
}
