package com.example.alexandriaapi.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(schema = "BookCategory")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    public BookCategory(Book book, Category category){
        this.book = book;
        this.category = category;
    }

}
