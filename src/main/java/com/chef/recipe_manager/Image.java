package com.chef.recipe_manager;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filename;

    @Lob
    private byte[] fileData;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe associatedRecipe;

    public Image() {
    }

    public Image(String filename, byte[] fileData, Recipe associatedRecipe) {
        this.filename = filename;
        this.fileData = fileData;
        this.associatedRecipe = associatedRecipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }

    // Getters and setters
}
