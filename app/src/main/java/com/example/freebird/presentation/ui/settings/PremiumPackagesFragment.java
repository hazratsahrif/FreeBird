package com.example.freebird.presentation.ui.settings;

import android.view.View;

import com.example.freebird.databinding.FragmentPremiumPackagesBinding;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;

public class PremiumPackagesFragment extends BaseFragmentBaseFragment<FragmentPremiumPackagesBinding> {

    @Override
    public void initToolbar() {
        binding.toolbar.btnBack.setOnClickListener(view -> requireActivity().onBackPressed());
        binding.toolbar.tvTitle.setText("Premium Packages");
        binding.toolbar.btnContactUs.setVisibility(View.VISIBLE);

    }

    @Override
    public void setupView() {

    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }
}