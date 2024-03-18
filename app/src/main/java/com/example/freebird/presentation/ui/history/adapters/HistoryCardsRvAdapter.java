package com.example.freebird.presentation.ui.history.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.LayoutHistoryCardItemBinding;
import com.example.freebird.presentation.ui.history.models.GroupedHistory;

import java.util.List;

public class HistoryCardsRvAdapter extends RecyclerView.Adapter<HistoryCardsRvAdapter.ViewHolder> {

    List<GroupedHistory> groupedHistories;
    OnHistoryClickListener onHistoryClickListener;
    public HistoryCardsRvAdapter(List<GroupedHistory> groupedHistories){
        this.groupedHistories = groupedHistories;
    }

    public void setOnHistoryClickListener(OnHistoryClickListener onHistoryClickListener) {
        this.onHistoryClickListener = onHistoryClickListener;
    }

    @NonNull
    @Override
    public HistoryCardsRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutHistoryCardItemBinding binding = LayoutHistoryCardItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryCardsRvAdapter.ViewHolder holder, int position) {
        ConcatAdapter concatAdapter = new ConcatAdapter();
        GroupedHistory groupedHistory = groupedHistories.get(position);
        HistoryHeaderRvAdapter historyHeaderRvAdapter = new HistoryHeaderRvAdapter(groupedHistory.getHistoryHeaderItems());
        HistoryUrlRvAdapter historyUrlRvAdapter = new HistoryUrlRvAdapter(groupedHistory.getHistoryUrlItems());
        historyUrlRvAdapter.setOnHistoryClickListener(onHistoryClickListener);
        concatAdapter.addAdapter(historyHeaderRvAdapter);
        concatAdapter.addAdapter(historyUrlRvAdapter);
        holder.itemView.recyclerView.setAdapter(concatAdapter);
        holder.itemView.recyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getRoot().getContext()));
        holder.itemView.recyclerView.setNestedScrollingEnabled(false);
    }

    @Override
    public int getItemCount() {
        return groupedHistories.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{
        LayoutHistoryCardItemBinding itemView;
        public ViewHolder(@NonNull LayoutHistoryCardItemBinding itemView) {
            super(itemView.getRoot());
            this.itemView = itemView;
        }
    }
}
