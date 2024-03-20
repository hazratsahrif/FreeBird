package com.example.freebird.presentation.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.HomeHeaderItemBinding;
import com.example.freebird.databinding.HomeRecentItemLayoutBinding;
import com.example.freebird.presentation.ui.home.model.HeaderModel;
import com.example.freebird.presentation.ui.home.model.RecentModel;

import java.util.List;

public class HomeRecentAdapter extends RecyclerView.Adapter<HomeRecentAdapter.ViewHolder> {
     HomeRecentItemLayoutBinding binding;
     Context context;
     List<RecentModel> recentModelList;

    public HomeRecentAdapter(Context context, List<RecentModel> recentModelList) {
        this.context = context;
        this.recentModelList = recentModelList;
    }

    @NonNull
    @Override
    public HomeRecentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = HomeRecentItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecentAdapter.ViewHolder holder, int position) {
        holder.binding.ivYoutube.setImageResource(recentModelList.get(position).getIvSocial());
        if(position == 3){
            holder.binding.divider.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return recentModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        HomeRecentItemLayoutBinding binding;
        public ViewHolder(@NonNull HomeRecentItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
