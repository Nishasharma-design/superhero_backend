package com.superhero.superhero_backend.hero;

public class HeroDTO {
    private String name;
    private String slug;
    private Powerstats powerstats;
    private Images images;
    private Appearance appearance;
    private Biography biography;
    private Work work;
    private Connections connections;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }

    public Powerstats getPowerstats() { return powerstats; }
    public void setPowerstats(Powerstats powerstats) { this.powerstats = powerstats; }

    public Images getImages() { return images; }
    public void setImages(Images images) { this.images = images; }

    public Appearance getAppearance() { return appearance; }
    public void setAppearance(Appearance appearance) { this.appearance = appearance; }

    public Biography getBiography() { return biography; }
    public void setBiography(Biography biography) { this.biography = biography; }

    public Work getWork() { return work; }
    public void setWork(Work work) { this.work = work; }

    public Connections getConnections() { return connections; }
    public void setConnections(Connections connections) { this.connections = connections; }
}
