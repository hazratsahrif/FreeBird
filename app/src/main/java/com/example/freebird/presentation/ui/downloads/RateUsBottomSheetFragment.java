package com.example.freebird.presentation.ui.downloads;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentRateUsBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class RateUsBottomSheetFragment extends BottomSheetDialogFragment {
    FragmentRateUsBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRateUsBottomSheetBinding.inflate(inflater,container,false);
        initData();
        return binding.getRoot();
    }

    private void initData() {
        binding.btnRate.btnPrimary.setText("Rate Now");
    }
}