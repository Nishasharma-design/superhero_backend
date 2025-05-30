package com.superhero.superhero_backend.hero;

public class HeroDTO {
    private String name;
    private String slug;
    private Powerstats powerstats;
    private Images images;

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }

    public Powerstats getPowerstats() { return powerstats; }
    public void setPowerstats(Powerstats powerstats) { this.powerstats = powerstats; }

    public Images getImages() { return images; }
    public void setImages(Images images) { this.images = images; }
}

