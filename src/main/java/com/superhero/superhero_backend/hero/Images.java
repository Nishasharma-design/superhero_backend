package com.superhero.superhero_backend.hero;

import jakarta.persistence.Embeddable;

@Embeddable
public class Images {
    private String xs;
    private String sm;
    private String md;
    private String lg;


    public String getXs() { return xs; }
    public void setXs(String xs) { this.xs = xs; }

    public String getSm() { return sm; }
    public void setSm(String sm) { this.sm = sm; }

    public String getMd() { return md; }
    public void setMd(String md) { this.md = md; }

    public String getLg() { return lg; }
    public void setLg(String lg) { this.lg = lg; }
}
