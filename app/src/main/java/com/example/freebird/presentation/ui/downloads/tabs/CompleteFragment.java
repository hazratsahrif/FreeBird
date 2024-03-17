package com.example.freebird.presentation.ui.downloads.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.adapter.CardAdapter;
import com.example.freebird.adapter.HeaderAdapter;
import com.example.freebird.databinding.FragmentCompleteBinding;
import com.example.freebird.model.CardModel;
import com.example.freebird.model.DownloadModel;

import java.util.ArrayList;
import java.util.List;

public class CompleteFragment extends Fragment {
    FragmentCompleteBinding binding;
    RecyclerView recyclerView;
    HeaderAdapter headerAdapter1;
    HeaderAdapter headerAdapter2;
    HeaderAdapter headerAdapter3;
    CardAdapter cardAdapter1;
    CardAdapter cardAdapter2;
    CardAdapter cardAdapter3;
    ConcatAdapter concatAdapter1;
    ArrayList<DownloadModel> downloadModelArrays;
    List<CardModel> cardModels;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         binding = FragmentCompleteBinding.inflate(getLayoutInflater());
         downloadModelArrays = new ArrayList<>();
         cardModels = new ArrayList<>();
         recyclerView = binding.rv;
         initData();



        return binding.getRoot();
    }

    private void initData() {
      String textHeader1 = "Today";
      String textHeader2 = "This Week";
      String textHeader3 = "This Month";
      addCardList();
      headerAdapter1 = new HeaderAdapter(textHeader1,getContext());
      headerAdapter2 = new HeaderAdapter(textHeader2,getContext());
      headerAdapter3 = new HeaderAdapter(textHeader3,getContext());

      cardAdapter1 = new CardAdapter(cardModels,getContext());
      cardAdapter2 = new CardAdapter(cardModels,getContext());
      cardAdapter3 = new CardAdapter(cardModels,getContext());

      concatAdapter1 = new ConcatAdapter(
              headerAdapter1,
              cardAdapter1,
              headerAdapter2,
              cardAdapter2,
              headerAdapter3,
              cardAdapter3);

      concatAdapter1.addAdapter(headerAdapter1);
      concatAdapter1.addAdapter(cardAdapter1);
        concatAdapter1.addAdapter(headerAdapter2);
        concatAdapter1.addAdapter(cardAdapter2);
        concatAdapter1.addAdapter(headerAdapter3);
        concatAdapter1.addAdapter(cardAdapter3);
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.rv.setAdapter(concatAdapter1);
    }

    private void addCardList() {
        for (int i=0; i<=3; i++){
            cardModels.add(new CardModel("Movie title",R.drawable.img));
        }
    }
}