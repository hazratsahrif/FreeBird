package com.example.freebird.presentation.ui.history;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentClearHistoryBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ClearHistoryBottomSheetFragment extends BottomSheetDialogFragment {
    FragmentClearHistoryBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentClearHistoryBottomSheetBinding.inflate(inflater, container, false);
        init();
        return binding.getRoot();
    }

    private void init() {

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dates));
        binding.autoCompleteTextView.setAdapter(adapter);

    }
}