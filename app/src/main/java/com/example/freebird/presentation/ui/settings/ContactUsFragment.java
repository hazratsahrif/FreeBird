package com.example.freebird.presentation.ui.settings;

import android.view.View;

import com.example.freebird.databinding.FragmentContactUsBinding;
import com.example.freebird.presentation.ui.base.BaseFragment;

public class ContactUsFragment extends BaseFragment<FragmentContactUsBinding> {

    @Override
    public void initToolbar() {
        binding.toolbar.tvTitle.setText("Contact Us");
        binding.toolbar.btnContactUs.setVisibility(View.VISIBLE);
    }

    @Override
    public void setupView() {
//        LayoutFaqExpandableParentItemBinding.bind(binding.expandable2.parentLayout).tvTitle.setText("What about the premium package rate?");
//        LayoutFaqExpandableParentItemBinding.bind(binding.expandable3.parentLayout).tvTitle.setText("How to Purchase premium subscription for this app?");
//        binding.expandable.setOnClickListener(view -> binding.expandable.toggleLayout());
//        binding.expandable2.setOnClickListener(view -> {
//            binding.expandable2.toggleLayout();
//        });
//        binding.expandable3.setOnClickListener(view -> {
//            binding.expandable3.toggleLayout();
//        });


        binding.expandableLayout2.parent.tvTitle.setText("What about the premium package rate?");
        binding.expandableLayout3.parent.tvTitle.setText("How to Purchase premium subscription for this app?");

        binding.expandableLayout1.parent.getRoot().setOnClickListener(view -> {
            if (binding.expandableLayout1.child.getRoot().getVisibility() == View.VISIBLE) {
                binding.expandableLayout1.child.getRoot().setVisibility(View.GONE);
            } else {
                binding.expandableLayout1.child.getRoot().setVisibility(View.VISIBLE);
            }
        });

        binding.expandableLayout2.parent.getRoot().setOnClickListener(view -> {
            if (binding.expandableLayout2.child.getRoot().getVisibility() == View.VISIBLE) {
                binding.expandableLayout2.child.getRoot().setVisibility(View.GONE);
            } else {
                binding.expandableLayout2.child.getRoot().setVisibility(View.VISIBLE);
            }
        });

        binding.expandableLayout3.parent.getRoot().setOnClickListener(view -> {
            if (binding.expandableLayout3.child.getRoot().getVisibility() == View.VISIBLE) {
                binding.expandableLayout3.child.getRoot().setVisibility(View.GONE);
            } else {
                binding.expandableLayout3.child.getRoot().setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }

}