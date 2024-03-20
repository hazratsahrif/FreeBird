package com.example.freebird.presentation.ui.downloads.tabs;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.freebird.R;
import com.example.freebird.Utils;
import com.example.freebird.adapter.HeaderAdapter;
import com.example.freebird.databinding.FragmentCompleteBinding;
import com.example.freebird.presentation.ui.downloads.adapter.CardAdapter;
import com.example.freebird.presentation.ui.downloads.model.CardModel;
import com.example.freebird.presentation.ui.downloads.model.DownloadModel;

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
    PopupMenu popup;
    ConcatAdapter concatAdapter1;
    ArrayList<DownloadModel> downloadModelArrays;
    List<CardModel> cardModels;
    Utils utils;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCompleteBinding.inflate(getLayoutInflater());
        downloadModelArrays = new ArrayList<>();
        cardModels = new ArrayList<>();
        recyclerView = binding.rv;
        utils = new Utils();
        initData();
        setOnClickListner();

        return binding.getRoot();
    }

    private void setOnClickListner() {
        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(v);
            }
        });
    }

    private void initData() {
        String textHeader1 = "Today";
        String textHeader2 = "This Week";
        String textHeader3 = "This Month";
        cardModels = utils.getDownloadCardList(3);
        headerAdapter1 = new HeaderAdapter(textHeader1, getContext());
        headerAdapter2 = new HeaderAdapter(textHeader2, getContext());
        headerAdapter3 = new HeaderAdapter(textHeader3, getContext());
        cardAdapter1 = new CardAdapter(cardModels, getContext());
        cardAdapter2 = new CardAdapter(cardModels, getContext());
        cardAdapter3 = new CardAdapter(cardModels, getContext());
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
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        binding.rv.setAdapter(concatAdapter1);
    }

    private void showPopup(View v) {
        popup = new PopupMenu(requireContext(), v, Gravity.CENTER_HORIZONTAL);
        Context wrapper = new ContextThemeWrapper(requireContext(), R.style.PopupMenu);
        popup = new PopupMenu(wrapper, v);
        popup.getMenuInflater().inflate(R.menu.donwnalod_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(item -> {
            Navigation.findNavController(getView()).navigate(R.id.action_downloadsFragment_to_deleteBottomSheetFragment);
            return true;
        });
        popup.show();
    }

}