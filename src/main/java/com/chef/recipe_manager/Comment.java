package com.chef.recipe_manager;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime datePosted;

    public Comment() {
    }

    public Comment(String text, LocalDateTime datePosted, RecipeUser author, Recipe associatedRecipe) {
        this.text = text;
        this.datePosted = datePosted;
        this.author = author;
        this.associatedRecipe = associatedRecipe;
    }

    @ManyToOne
    @JoinColumn(name = "author_id")
    private RecipeUser author;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe associatedRecipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    public RecipeUser getAuthor() {
        return author;
    }

    public void setAuthor(RecipeUser author) {
        this.author = author;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}

