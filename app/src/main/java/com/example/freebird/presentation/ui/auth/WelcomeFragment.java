package com.example.freebird.presentation.ui.auth;

import android.view.View;

import com.example.freebird.databinding.FragmentWelcomeBinding;
import com.example.freebird.presentation.ui.base.BaseFragment;

public class WelcomeFragment extends BaseFragment<FragmentWelcomeBinding> {

    @Override
    public void initToolbar() {
        // Toolbar it not preset in this fragment
    }

    @Override
    public void setupView() {
        binding.btnSignIn.setOnClickListener(view -> findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToSignInFragment()));
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }
}