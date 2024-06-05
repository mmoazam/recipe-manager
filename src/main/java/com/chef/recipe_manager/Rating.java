package com.chef.recipe_manager;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value; // e.g., 1-5 stars
    private LocalDateTime dateRated;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe associatedRecipe;

    @ManyToOne
    @JoinColumn(name = "rater_id")
    private RecipeUser rater;

    public Rating() {
    }

    public Rating(int value, LocalDateTime dateRated, Recipe associatedRecipe, RecipeUser rater) {
        this.value = value;
        this.dateRated = dateRated;
        this.associatedRecipe = associatedRecipe;
        this.rater = rater;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LocalDateTime getDateRated() {
        return dateRated;
    }

    public void setDateRated(LocalDateTime dateRated) {
        this.dateRated = dateRated;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }

    public RecipeUser getRater() {
        return rater;
    }

    public void setRater(RecipeUser rater) {
        this.rater = rater;
    }

    // Getters and setters
}
