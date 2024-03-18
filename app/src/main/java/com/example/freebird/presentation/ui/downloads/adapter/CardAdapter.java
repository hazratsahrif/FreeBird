package com.example.freebird.presentation.ui.downloads.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.DownloadCardItemBinding;
import com.example.freebird.databinding.DownloadHeaderItemBinding;
import com.example.freebird.model.CardModel;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    DownloadCardItemBinding binding;
    List<CardModel> list;
    Context context;

    public CardAdapter(List<CardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DownloadCardItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return  new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.ivCard.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        DownloadCardItemBinding binding;
        public ViewHolder(@NonNull DownloadCardItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
