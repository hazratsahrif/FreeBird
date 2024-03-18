package com.example.freebird.presentation.ui.downloads;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.freebird.databinding.FragmentDeleteBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class DeleteBottomSheetFragment extends BottomSheetDialogFragment {
    FragmentDeleteBottomSheetBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDeleteBottomSheetBinding.inflate(inflater,container,false);
        initData();
        return binding.getRoot();
    }

    private void initData() {
        binding.btnDelete.btnPrimary.setText("Delete");
        binding.btnDelete.btnPrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();

            }
        });
    }
}