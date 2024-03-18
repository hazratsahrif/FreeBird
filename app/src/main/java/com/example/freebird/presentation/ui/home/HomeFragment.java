package com.example.freebird.presentation.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        initData();

        return binding.getRoot();
    }

    private void initData() {
        binding.toolbar.btnBack.setImageResource(R.drawable.hoem_icon);
        binding.toolbar.notifyText.setVisibility(View.VISIBLE);
    }
}