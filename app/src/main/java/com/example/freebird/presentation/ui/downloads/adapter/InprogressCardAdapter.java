package com.example.freebird.presentation.ui.downloads.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.freebird.databinding.InprogressCardItemBinding;
import com.example.freebird.presentation.ui.downloads.model.CardModel;
import java.util.List;

public class InprogressCardAdapter extends RecyclerView.Adapter<InprogressCardAdapter.ViewHolder> {
    InprogressCardItemBinding binding;
    List<CardModel> list;
    Context context;

    public InprogressCardAdapter(List<CardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = InprogressCardItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
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
        InprogressCardItemBinding binding;
        public ViewHolder(@NonNull InprogressCardItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
