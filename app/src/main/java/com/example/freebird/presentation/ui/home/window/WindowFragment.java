package com.example.freebird.presentation.ui.home.window;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentWindowBinding;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;
import com.example.freebird.presentation.ui.home.window.adapter.NewTabAdapter;

public class WindowFragment extends BaseFragmentBaseFragment<FragmentWindowBinding> {

    NewTabAdapter adapter;


    @Override
    public void initToolbar() {
        binding.toolbar.btnMore.setVisibility(View.VISIBLE);
        binding.toolbar.btnBack.setImageResource(R.drawable.cross);
        binding.toolbar.tvTitle.setText("New tab");
    }

    @Override
    public void setupView() {
        adapter = new NewTabAdapter(getContext());
        binding.rvTab.setLayoutManager(new GridLayoutManager(getContext(),2));
        binding.rvTab.setAdapter(adapter);

    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }
}