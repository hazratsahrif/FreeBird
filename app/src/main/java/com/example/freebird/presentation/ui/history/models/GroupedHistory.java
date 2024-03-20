package com.example.freebird.presentation.ui.history.models;

import java.util.List;

public class GroupedHistory {
    List<HistoryUrlItem> historyUrlItems;
    HistoryHeaderItem historyHeaderItems;

    public GroupedHistory(List<HistoryUrlItem> historyUrlItems, HistoryHeaderItem historyHeaderItems) {
        this.historyUrlItems = historyUrlItems;
        this.historyHeaderItems = historyHeaderItems;
    }

    public List<HistoryUrlItem> getHistoryUrlItems() {
        return historyUrlItems;
    }

    public HistoryHeaderItem getHistoryHeaderItems() {
        return historyHeaderItems;
    }
}
