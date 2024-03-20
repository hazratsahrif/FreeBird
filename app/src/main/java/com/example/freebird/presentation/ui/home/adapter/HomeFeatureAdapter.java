package com.example.freebird.presentation.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.HomeFeatureItemBinding;
import com.example.freebird.databinding.HomeRecentItemLayoutBinding;
import com.example.freebird.presentation.ui.home.model.RecentModel;

import java.util.List;

public class HomeFeatureAdapter extends RecyclerView.Adapter<HomeFeatureAdapter.ViewHolder> {
     HomeFeatureItemBinding binding;
     Context context;
//     List<RecentModel> recentModelList;

    public HomeFeatureAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HomeFeatureAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = HomeFeatureItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFeatureAdapter.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        HomeFeatureItemBinding binding;
        public ViewHolder(@NonNull HomeFeatureItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
