package com.example.freebird.presentation.ui.settings;

import android.view.View;

import com.example.freebird.databinding.FragmentContactUsBinding;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;

public class ContactUsFragment extends BaseFragmentBaseFragment<FragmentContactUsBinding> {

    @Override
    public void initToolbar() {
        binding.toolbar.tvTitle.setText("Contact Us");
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