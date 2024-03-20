package com.example.freebird.presentation.ui.settings;

import android.view.View;
import android.widget.Toast;

import com.example.freebird.databinding.FragmentContactUsBinding;
import com.example.freebird.databinding.LayoutFaqExpandableParentItemBinding;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;

public class ContactUsFragment extends BaseFragmentBaseFragment<FragmentContactUsBinding>  {

    @Override
    public void initToolbar() {
        binding.toolbar.tvTitle.setText("Contact Us");
        binding.toolbar.btnContactUs.setVisibility(View.VISIBLE);
    }

    @Override
    public void setupView() {
        LayoutFaqExpandableParentItemBinding.bind(binding.expandable2.parentLayout).tvTitle.setText("What about the premium package rate?");
        LayoutFaqExpandableParentItemBinding.bind(binding.expandable3.parentLayout).tvTitle.setText("How to Purchase premium subscription for this app?");
        binding.expandable.setOnClickListener(view -> binding.expandable.toggleLayout());
        binding.expandable2.setOnClickListener(view -> {
            binding.expandable2.toggleLayout();
        });
        binding.expandable3.setOnClickListener(view -> {
            binding.expandable3.toggleLayout();
        });
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }

}