package com.superhero.superhero_backend.hero;

import jakarta.persistence.Embeddable;

@Embeddable
public class Work {
    private String occupation;
    private String base;

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    public String getBase() { return base; }
    public void setBase(String base) { this.base = base; }
}
