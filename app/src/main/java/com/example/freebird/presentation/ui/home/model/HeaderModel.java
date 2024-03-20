package com.example.freebird.presentation.ui.home.model;

public class HeaderModel {
    String tvTile, tvAction;

    public String getTvTile() {
        return tvTile;
    }

    public void setTvTile(String tvTile) {
        this.tvTile = tvTile;
    }

    public String getTvAction() {
        return tvAction;
    }

    public void setTvAction(String tvAction) {
        this.tvAction = tvAction;
    }

    public HeaderModel(String tvTile, String tvAction) {
        this.tvTile = tvTile;
        this.tvAction = tvAction;
    }
}
