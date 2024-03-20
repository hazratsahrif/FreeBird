package com.example.freebird.presentation.ui.listing.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.InprogressCardItemBinding;
import com.example.freebird.databinding.VideoTabCardItemBinding;
import com.example.freebird.presentation.ui.downloads.model.CardModel;

import java.util.List;

public class VideoTabCardAdapter extends RecyclerView.Adapter<VideoTabCardAdapter.ViewHolder> {
    VideoTabCardItemBinding binding;
    List<CardModel> list;
    Context context;
    OnClickItem onClickItem;

    public VideoTabCardAdapter(List<CardModel> list, Context context,OnClickItem onClickItem) {
        this.list = list;
        this.context = context;
        this.onClickItem = onClickItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = VideoTabCardItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return  new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.ivCard.setImageResource(list.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickItem.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        VideoTabCardItemBinding binding;
        public ViewHolder(@NonNull VideoTabCardItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public interface OnClickItem{
        void onClick(int pos);
    }
}
