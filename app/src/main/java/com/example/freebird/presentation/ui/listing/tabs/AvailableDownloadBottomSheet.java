package com.example.freebird.presentation.ui.listing.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.Utils;
import com.example.freebird.databinding.FragmentAvailableDownalodBottomSheetBinding;
import com.example.freebird.presentation.ui.downloads.model.CardModel;
import com.example.freebird.presentation.ui.listing.adapter.AvailableCardAdapter;
import com.example.freebird.presentation.ui.listing.adapter.VideoTabCardAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class AvailableDownloadBottomSheet extends BottomSheetDialogFragment implements AvailableCardAdapter.OnClickItem {
    FragmentAvailableDownalodBottomSheetBinding binding;
    Utils utils;
    AvailableCardAdapter videoTabCardAdapter;
    List<CardModel> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAvailableDownalodBottomSheetBinding.inflate(inflater,container,false);
        initData();
        return binding.getRoot();
    }

    private void initData() {
        list = new ArrayList<>();
        utils = new Utils();
        list = utils.getDownloadCardList(6);
        videoTabCardAdapter = new AvailableCardAdapter(list,getContext(),this);
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rv.setAdapter(videoTabCardAdapter);
        binding.btnDownload.btnPrimary.setText("Download");

    }

    @Override
    public void onClick(int pos) {
//        Navigation.findNavController(getView()).navigate(R.id.action_videoTabFragment_to_availableDownloadBottomSheet);

    }
}