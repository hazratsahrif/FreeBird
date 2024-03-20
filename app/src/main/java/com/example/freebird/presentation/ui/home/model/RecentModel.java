package com.example.freebird.presentation.ui.home.model;

public class RecentModel {
    int ivSocial;
    String link;

    public int getIvSocial() {
        return ivSocial;
    }

    public void setIvSocial(int ivSocial) {
        this.ivSocial = ivSocial;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public RecentModel(int ivSocial, String link) {
        this.ivSocial = ivSocial;
        this.link = link;
    }
}
