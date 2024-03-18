package com.example.freebird.presentation.ui.downloads.model;

import java.util.List;

public class DownloadModel {

    public static  final int LAYOUT_ONE = 1;
    public static  final int LAYOUT_TWO = 2;

    String headerText;
    int viewType;
    List<CardModel> list;

    public DownloadModel(int viewType,String headerText) {
        this.viewType = viewType;
        this.headerText = headerText;
    }

    public DownloadModel(int viewType, List<CardModel> list) {
        this.viewType = viewType;
        this.list = list;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public List<CardModel> getList() {
        return list;
    }

    public void setList(List<CardModel> list) {
        this.list = list;
    }
}
