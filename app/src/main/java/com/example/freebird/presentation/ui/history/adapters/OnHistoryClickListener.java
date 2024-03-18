package com.example.freebird.presentation.ui.history.adapters;

import com.example.freebird.presentation.ui.history.models.HistoryUrlItem;

public interface OnHistoryClickListener {
    void onHistoryClick(HistoryUrlItem historyUrlItem, int position);
    void onDeleteHistoryClick(HistoryUrlItem historyUrlItem, int position);
}
