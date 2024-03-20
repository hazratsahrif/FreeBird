package com.example.freebird.presentation.ui.bookmark;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentBookmarkBinding;

public class BookmarkFragment extends Fragment {
    FragmentBookmarkBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookmarkBinding.inflate(inflater,container,false);
        initToolbar();


        return binding.getRoot();
    }

    private void initToolbar() {
        binding.toolbar.tvTitle.setText(getString(R.string.bookmarks));

    }
}