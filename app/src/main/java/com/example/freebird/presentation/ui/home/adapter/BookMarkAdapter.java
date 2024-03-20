package com.example.freebird.presentation.ui.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.databinding.BookmarkItemLayoutBinding;
import com.example.freebird.presentation.ui.home.model.BookmarkItem;

import java.util.List;

public class BookMarkAdapter extends RecyclerView.Adapter<BookMarkAdapter.ViewHolder> {
     BookmarkItemLayoutBinding binding;
     Context context;
     List<BookmarkItem> list;
     OnClickButton onClickButton;


    public BookMarkAdapter(Context context, List<BookmarkItem> list,OnClickButton onClickButton) {
        this.context = context;
        this.list = list;
        this.onClickButton = onClickButton;
    }

    @NonNull
    @Override
    public BookMarkAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = BookmarkItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookMarkAdapter.ViewHolder holder, int position) {
        BookmarkItem item = list.get(position);
        holder.binding.ivBookmark.setImageResource(item.getIvBookMark());
        holder.binding.tvBookmark.setText(item.getIvTitle());
        holder.binding.ivBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton.onClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        BookmarkItemLayoutBinding binding;
        public ViewHolder(@NonNull BookmarkItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    public  interface OnClickButton{
        void onClick(int pos);
    }
}

