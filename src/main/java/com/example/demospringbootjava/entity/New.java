package com.example.demospringbootjava.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "new")
@Getter
@Setter
public class New extends BaseEntity{
    private String title;
    private String thumbnail;

    @Column(name = "shortdescription")
    private String shortDescription;
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
