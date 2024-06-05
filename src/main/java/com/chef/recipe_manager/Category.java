package com.chef.recipe_manager;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
