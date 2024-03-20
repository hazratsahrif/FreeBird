package com.example.freebird.presentation.ui.home.model;

public class SideMenuModel {
    int ivIcon;
    String tvTitle;

    public int getIvIcon() {
        return ivIcon;
    }

    public void setIvIcon(int ivIcon) {
        this.ivIcon = ivIcon;
    }

    public String getTvTitle() {
        return tvTitle;
    }

    public void setTvTitle(String tvTitle) {
        this.tvTitle = tvTitle;
    }

    public SideMenuModel(int ivIcon, String tvTitle) {
        this.ivIcon = ivIcon;
        this.tvTitle = tvTitle;
    }
}
