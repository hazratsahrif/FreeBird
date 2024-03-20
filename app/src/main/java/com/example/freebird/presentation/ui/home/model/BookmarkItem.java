package com.example.freebird.presentation.ui.home.model;

public class BookmarkItem {
    int ivBookMark;
    String ivTitle;

    public int getIvBookMark() {
        return ivBookMark;
    }

    public void setIvBookMark(int ivBookMark) {
        this.ivBookMark = ivBookMark;
    }

    public String getIvTitle() {
        return ivTitle;
    }

    public void setIvTitle(String ivTitle) {
        this.ivTitle = ivTitle;
    }

    public BookmarkItem(int ivBookMark, String ivTitle) {
        this.ivBookMark = ivBookMark;
        this.ivTitle = ivTitle;
    }
}
