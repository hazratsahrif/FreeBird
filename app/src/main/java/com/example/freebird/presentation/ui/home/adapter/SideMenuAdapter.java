package com.example.freebird.presentation.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.HomeRecentItemLayoutBinding;
import com.example.freebird.databinding.MenuItemLayoutBinding;
import com.example.freebird.presentation.ui.home.model.RecentModel;
import com.example.freebird.presentation.ui.home.model.SideMenuModel;

import java.util.List;

public class SideMenuAdapter extends RecyclerView.Adapter<SideMenuAdapter.ViewHolder> {
     MenuItemLayoutBinding binding;
     Context context;
     List<SideMenuModel> menuModels;

    public SideMenuAdapter(Context context, List<SideMenuModel> menuModels) {
        this.context = context;
        this.menuModels = menuModels;
    }

    @NonNull
    @Override
    public SideMenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = MenuItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SideMenuAdapter.ViewHolder holder, int position) {
        SideMenuModel model = menuModels.get(position);
        holder.binding.ivIcon.setImageResource(model.getIvIcon());
        holder.binding.tvTitle.setText(model.getTvTitle());


    }

    @Override
    public int getItemCount() {
        return menuModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MenuItemLayoutBinding binding;
        public ViewHolder(@NonNull MenuItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
