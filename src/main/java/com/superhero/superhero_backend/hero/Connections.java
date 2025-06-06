package com.superhero.superhero_backend.hero;

import jakarta.persistence.Embeddable;

@Embeddable
public class Connections {
    private String groupAffiliation;
    private String relatives;

    public String getGroupAffiliation() { return groupAffiliation; }
    public void setGroupAffiliation(String groupAffiliation) { this.groupAffiliation = groupAffiliation; }

    public String getRelatives() { return relatives; }
    public void setRelatives(String relatives) { this.relatives = relatives; }
}
