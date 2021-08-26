package com.yashen.servicebreak.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "BOOK_TITLE",nullable = false)
    private String name;
    @Column(name = "YEAR",nullable = false)
    private Long year;
    @Column(name = "PAGE_COUNT")
    private int pageCount;
    @Column(name = "PRINTED_DATE",nullable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date mintedDate;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID",referencedColumnName = "id")
    private Author authors;
}
