package com.example.freebird.presentation.ui.downloads;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import com.example.freebird.R;

import com.example.freebird.databinding.FragmentDownloadsBinding;
import com.example.freebird.presentation.ui.downloads.adapter.DownloadPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class DownloadsFragment extends Fragment {

    FragmentDownloadsBinding binding;
    DownloadPagerAdapter myPagerAdapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDownloadsBinding.inflate(getLayoutInflater());
        initTabs();
        initData();
        setOnClick();
        return binding.getRoot();
    }

    private void setOnClick() {
        binding.btnRateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.action_downloadsFragment_to_rateUsBottomSheetFragment);

            }
        });
    }

    private void initData() {
        binding.layoutToolbar.tvTitle.setText("Download");

    }


    private void initTabs() {
        ViewPager2 viewPager = binding.vpLanding;
        TabLayout tabLayout = binding.tabLayout;
        TabLayout.Tab tab1 = tabLayout.newTab();
        TabLayout.Tab tab2 = tabLayout.newTab();
        tab1.setText("In Progress");
        tab2.setText("Completed");
        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);

        myPagerAdapter = new DownloadPagerAdapter(requireActivity());
        // Set the adapter on the ViewPager
        viewPager.setAdapter(myPagerAdapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            List<String> tabNames = Arrays.asList("In Progress", "Completed");
            tab.setText(tabNames.get(position));
        });
        tabLayoutMediator.attach();

    }

    @Override
    public void onDestroy() {
        binding = null;
        super.onDestroy();
    }
}