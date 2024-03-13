package com.example.freebird.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.DownloadHeaderItemBinding;

public class HeaderAdapter extends RecyclerView.Adapter<HeaderAdapter.ViewHolder> {
    DownloadHeaderItemBinding binding;
    String string;
    Context context;


    public HeaderAdapter(String string, Context context) {
        this.string = string;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DownloadHeaderItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return  new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvHeader.setText(string);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        DownloadHeaderItemBinding binding;
        public ViewHolder(@NonNull DownloadHeaderItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
