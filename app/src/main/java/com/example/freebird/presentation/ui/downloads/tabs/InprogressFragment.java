package com.example.freebird.presentation.ui.downloads.tabs;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.freebird.R;
import com.example.freebird.Utils;
import com.example.freebird.databinding.FragmentInprogressBinding;
import com.example.freebird.presentation.ui.downloads.adapter.InprogressCardAdapter;

import java.util.ArrayList;
import java.util.List;

public class InprogressFragment extends Fragment {
    FragmentInprogressBinding binding;
    List<com.example.freebird.model.CardModel> cardModelList;
    InprogressCardAdapter adapter;
    PopupMenu popup;
    Utils utils = new Utils();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInprogressBinding.inflate(inflater,container,false);
        initData();
        setOnClickListner();
        return binding.getRoot();
    }
    private void setOnClickListner() {
        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(v);
            }
        });
    }

    private void showPopup(View v) {
        popup = new PopupMenu(requireContext(), v, Gravity.CENTER_HORIZONTAL);
        Context wrapper = new ContextThemeWrapper(requireContext(), R.style.PopupMenu);
        popup = new PopupMenu(wrapper, v);
        popup.getMenuInflater().inflate(R.menu.inprogress_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(item -> {
            Navigation.findNavController(getView()).navigate(R.id.action_downloadsFragment_to_deleteBottomSheetFragment);
            return true;
        });
        popup.show();
    }

    private void initData() {
        cardModelList = new ArrayList<>();
        cardModelList = utils.getDownloadCardList(7);
        adapter = new InprogressCardAdapter( cardModelList,getContext());
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rv.setAdapter(adapter);

    }
}