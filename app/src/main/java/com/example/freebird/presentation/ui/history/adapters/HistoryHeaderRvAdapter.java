package com.example.freebird.presentation.ui.history.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.LayoutHistoryHeaderItemBinding;
import com.example.freebird.presentation.ui.history.models.HistoryHeaderItem;

public class HistoryHeaderRvAdapter extends RecyclerView.Adapter<HistoryHeaderRvAdapter.ViewHolder> {

    HistoryHeaderItem historyHeaderItem;

    public HistoryHeaderRvAdapter(HistoryHeaderItem historyHeaderItem) {
        this.historyHeaderItem = historyHeaderItem;
    }

    @NonNull
    @Override
    public HistoryHeaderRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutHistoryHeaderItemBinding binding = LayoutHistoryHeaderItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHeaderRvAdapter.ViewHolder holder, int position) {
        holder.itemView.tvTitle.setText(historyHeaderItem.getDateTime());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {
        LayoutHistoryHeaderItemBinding itemView;

        public ViewHolder(@NonNull LayoutHistoryHeaderItemBinding itemView) {
            super(itemView.getRoot());
            this.itemView = itemView;
        }
    }
}
