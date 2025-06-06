package com.superhero.superhero_backend.hero;

import jakarta.persistence.Embeddable;

@Embeddable
public class Powerstats {
    private int intelligence;
    private int strength;
    private int speed;
    private int durability;
    private int power;
    private int combat;

    
    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getDurability() { return durability; }
    public void setDurability(int durability) { this.durability = durability; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public int getCombat() { return combat; }
    public void setCombat(int combat) { this.combat = combat; }
}
