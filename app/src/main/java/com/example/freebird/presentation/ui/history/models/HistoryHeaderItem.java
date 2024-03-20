package com.example.freebird.presentation.ui.history.models;

public class HistoryHeaderItem implements HistoryBaseItem {

    HistoryItemType itemType;
    String dateTime;

    public HistoryHeaderItem(HistoryItemType itemType, String dateTime) {
        this.itemType = itemType;
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }


    @Override
    public HistoryItemType getItemType() {
        return itemType;
    }
}
