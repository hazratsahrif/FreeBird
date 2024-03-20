package com.example.freebird.presentation.ui.history.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.LayoutHistoryItemBinding;
import com.example.freebird.presentation.ui.history.models.HistoryItem;
import com.example.freebird.presentation.ui.history.models.HistoryUrlItem;

import java.util.List;

public class HistoryUrlRvAdapter extends RecyclerView.Adapter<HistoryUrlRvAdapter.ViewHolder> {

    List<HistoryUrlItem> historyItems;

    OnHistoryClickListener onHistoryClickListener;
    HistoryUrlRvAdapter(List<HistoryUrlItem> historyItems){
        this.historyItems = historyItems;
    }

    public void setOnHistoryClickListener(OnHistoryClickListener onHistoryClickListener) {
        this.onHistoryClickListener = onHistoryClickListener;
    }

    @NonNull
    @Override
    public HistoryUrlRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutHistoryItemBinding binding = LayoutHistoryItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryUrlRvAdapter.ViewHolder holder, int position) {
        HistoryUrlItem historyItem = historyItems.get(position);
        holder.itemView.tvTitle.setText(historyItem.getHistoryTitle());
        holder.itemView.tvSubtitle.setText(historyItem.getHistoryUrl());
        holder.itemView.ivLogo.setImageResource(historyItem.getHistoryImageId());

        holder.itemView.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onHistoryClickListener != null){
                    onHistoryClickListener.onHistoryClick(historyItem, position);
                }
            }
        });

        holder.itemView.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onHistoryClickListener != null){
                    onHistoryClickListener.onDeleteHistoryClick(historyItem, position);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return historyItems.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{
        LayoutHistoryItemBinding itemView;
        public ViewHolder(@NonNull LayoutHistoryItemBinding itemView) {
            super(itemView.getRoot());
            this.itemView = itemView;
        }
    }
}
