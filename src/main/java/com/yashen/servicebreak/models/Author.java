package com.yashen.servicebreak.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AUTHORS")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME",nullable = false)
    private String name;
    @Column(name="COUNTRY")
    private String country;
    //add book reference



}
