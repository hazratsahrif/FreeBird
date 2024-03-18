package com.example.freebird.presentation.ui.settings;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentFeedbackBinding;

public class FeedbackFragment extends Fragment {

    FragmentFeedbackBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFeedbackBinding.inflate(inflater, container, false);
        init();
        return binding.getRoot();
    }

    private void init() {
        binding.toolbar.tvTitle.setText("Feedback");

        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.topics));
        binding.autoCompleteTextView.setAdapter(adapter);

    }
}