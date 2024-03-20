package com.example.freebird.presentation.ui.home.window.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.BookmarkItemLayoutBinding;
import com.example.freebird.databinding.TabCardItemBinding;
import com.example.freebird.presentation.ui.home.model.BookmarkItem;

import java.util.List;

public class NewTabAdapter extends RecyclerView.Adapter<NewTabAdapter.ViewHolder> {
     TabCardItemBinding binding;
     Context context;


    public NewTabAdapter(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public NewTabAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = TabCardItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NewTabAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TabCardItemBinding binding;
        public ViewHolder(@NonNull TabCardItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
