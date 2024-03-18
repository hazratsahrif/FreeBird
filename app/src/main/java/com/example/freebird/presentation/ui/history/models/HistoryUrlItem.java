package com.example.freebird.presentation.ui.history.models;

public class HistoryUrlItem implements HistoryBaseItem {

    HistoryItemType itemType;
    String dateTime;
    String historyTitle;
    String historyUrl;
    int historyImageId;

    public HistoryUrlItem(HistoryItemType itemType, String dateTime) {
        this.itemType = itemType;
        this.dateTime = dateTime;
    }

    public HistoryUrlItem(HistoryItemType itemType, String historyTitle, String historyUrl, int historyImageId) {
        this.itemType = itemType;
        this.historyTitle = historyTitle;
        this.historyUrl = historyUrl;
        this.historyImageId = historyImageId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getHistoryTitle() {
        return historyTitle;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public int getHistoryImageId() {
        return historyImageId;
    }

    @Override
    public HistoryItemType getItemType() {
        return itemType;
    }
}
