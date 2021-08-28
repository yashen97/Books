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

    /*
    public Author(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Author() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }   */


}
