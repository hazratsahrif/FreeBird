package com.example.freebird.presentation.ui.history;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentHistoryBinding;
import com.example.freebird.presentation.ui.base.BaseFragment;
import com.example.freebird.presentation.ui.history.adapters.HistoryCardsRvAdapter;
import com.example.freebird.presentation.ui.history.adapters.OnHistoryClickListener;
import com.example.freebird.presentation.ui.history.models.GroupedHistory;
import com.example.freebird.presentation.ui.history.models.HistoryHeaderItem;
import com.example.freebird.presentation.ui.history.models.HistoryItemType;
import com.example.freebird.presentation.ui.history.models.HistoryUrlItem;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends BaseFragment<FragmentHistoryBinding> {

    @Override
    public void initToolbar() {
        binding.toolbar.tvTitle.setText("History");
        binding.toolbar.btnDelete.setVisibility(View.VISIBLE);
        binding.toolbar.btnList.setVisibility(View.VISIBLE);
        binding.toolbar.btnBack.setOnClickListener(v -> findNavController().navigateUp());

        binding.toolbar.btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });
        binding.toolbar.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findNavController().navigate(R.id.action_historyFragment_to_clearHistoryBottomSheetFragment);
            }
        });
    }

    private void showPopup(View v) {
        PopupMenu popup = new PopupMenu(requireContext(), v, Gravity.CENTER_HORIZONTAL);
        Context wrapper = new ContextThemeWrapper(requireContext(), R.style.PopupMenu);
        popup = new PopupMenu(wrapper, v);
        popup.getMenuInflater().inflate(R.menu.history_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(item -> {
            findNavController().navigate(R.id.action_downloadsFragment_to_deleteBottomSheetFragment);
            return true;
        });
        popup.show();
    }
    @Override
    public void setupView() {

        initRecyclerView();

        binding.searchButton.setOnClickListener(v -> {
            Toast.makeText(requireContext(), "Search Clicked", Toast.LENGTH_SHORT).show();
        });


    }

    private void initRecyclerView() {
        List<GroupedHistory> groupedHistories = generateMockData();
        HistoryCardsRvAdapter historyRvAdapter = new HistoryCardsRvAdapter(groupedHistories);

        historyRvAdapter.setOnHistoryClickListener(new OnHistoryClickListener() {
            @Override
            public void onHistoryClick(HistoryUrlItem historyUrlItem, int position) {
                Toast.makeText(requireContext(), historyUrlItem.getHistoryUrl() + " Clicked", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onDeleteHistoryClick(HistoryUrlItem historyUrlItem, int position) {
                Toast.makeText(requireContext(), historyUrlItem.getHistoryUrl() + " Deleted", Toast.LENGTH_SHORT).show();

            }
        });
        binding.recyclerView.setAdapter(historyRvAdapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public List<GroupedHistory> generateMockData() {
        List<GroupedHistory> groupedHistories = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<HistoryUrlItem> historyUrlItems = getHistoryUrlItems();

            HistoryHeaderItem historyHeaderItem = new HistoryHeaderItem(
                    HistoryItemType.HEADER,
                    "Today - 14 February, 2024"
            );

            GroupedHistory groupedHistory = new GroupedHistory(historyUrlItems, historyHeaderItem);
            groupedHistories.add(groupedHistory);
        }

        return groupedHistories;
    }

    @NonNull
    private static List<HistoryUrlItem> getHistoryUrlItems() {
        List<HistoryUrlItem> historyUrlItems = new ArrayList<>();
        String[] sites = {"YouTube", "Facebook", "Google"};
        String[] urls = {"www.youtube.com", "www.facebook.com", "www.google.com"};
        int[] imageIds = {R.drawable.youtube, R.drawable.facebook, R.drawable.web}; // replace with your actual drawable resources

        for (int j = 0; j < 3; j++) {
            HistoryUrlItem historyUrlItem = new HistoryUrlItem(
                    HistoryItemType.ITEM,
                    sites[j],
                    urls[j],
                    imageIds[j]
            );
            historyUrlItems.add(historyUrlItem);
        }
        return historyUrlItems;
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }
}