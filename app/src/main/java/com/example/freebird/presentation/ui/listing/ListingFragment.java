package com.example.freebird.presentation.ui.listing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.Utils;
import com.example.freebird.databinding.FragmentListingBinding;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;
import com.example.freebird.presentation.ui.downloads.adapter.DownloadPagerAdapter;
import com.example.freebird.presentation.ui.downloads.model.CardModel;
import com.example.freebird.presentation.ui.listing.adapter.NewTabPagerAdapter;
import com.example.freebird.presentation.ui.listing.adapter.VideoTabCardAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListingFragment extends BaseFragmentBaseFragment<FragmentListingBinding> {
    NewTabPagerAdapter adapter;
    @Override
    public void initToolbar() {

    }

    @Override
    public void setupView() {
        initTabs();


    }

    private void initTabs() {
        ViewPager2 viewPager = binding.vpLanding;
        TabLayout tabLayout = binding.tabLayout;
        adapter = new NewTabPagerAdapter(requireActivity());
        viewPager.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            List<String> tabNames = Arrays.asList("All", "Book","Videos","Images","News","Maps");
            tab.setText(tabNames.get(position));
        });
        tabLayoutMediator.attach();
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }
}