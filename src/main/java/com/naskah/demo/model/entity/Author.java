package com.naskah.demo.model.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Author {
    private Long id;
    private String name;
    private String slug;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private String birthPlace;
    private String nationality;
    private String biography;
    private String photoUrl;
    private String photoPath;
    private Integer totalBooks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
