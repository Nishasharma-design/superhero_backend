package com.superhero.superhero_backend.hero;

import jakarta.persistence.*;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String slug;

    @Embedded
    private Powerstats powerstats;

    @Embedded
    private Images images;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }

    public Powerstats getPowerstats() { return powerstats; }
    public void setPowerstats(Powerstats powerstats) { this.powerstats = powerstats; }

    public Images getImages() { return images; }
    public void setImages(Images images) { this.images = images; }
}

