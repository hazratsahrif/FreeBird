package com.example.freebird.presentation.ui.listing.tabs.video;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.Utils;
import com.example.freebird.databinding.FragmentVideoTabBinding;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;
import com.example.freebird.presentation.ui.downloads.model.CardModel;
import com.example.freebird.presentation.ui.listing.adapter.VideoTabCardAdapter;

import java.util.ArrayList;
import java.util.List;


public class VideoTabFragment extends BaseFragmentBaseFragment<FragmentVideoTabBinding> implements VideoTabCardAdapter.OnClickItem {

    Utils utils;
    VideoTabCardAdapter videoTabCardAdapter;
    List<CardModel> list;
    @Override
    public void initToolbar() {

    }

    @Override
    public void setupView() {
        list = new ArrayList<>();
        utils = new Utils();
        list = utils.getDownloadCardList(6);
        videoTabCardAdapter = new VideoTabCardAdapter(list,getContext(),this::onClick);
        binding.rvVideo.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvVideo.setAdapter(videoTabCardAdapter);
        binding.btnFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.action_listingFragment_to_availableDownloadBottomSheet);
            }
        });



    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }

    @Override
    public void onClick(int pos) {


    }
}