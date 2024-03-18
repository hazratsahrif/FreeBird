package com.example.freebird.presentation.ui.downloads.model;

public class CardModel {
    String title;
    int image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public CardModel(String title, int image) {
        this.title = title;
        this.image = image;
    }
}
