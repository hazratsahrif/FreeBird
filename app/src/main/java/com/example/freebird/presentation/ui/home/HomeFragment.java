package com.example.freebird.presentation.ui.home;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.example.freebird.R;
import com.example.freebird.Utils;
import com.example.freebird.presentation.ui.base.BaseFragment;
import com.example.freebird.presentation.ui.base.BaseFragmentBaseFragment;
import com.example.freebird.presentation.ui.downloads.adapter.CardAdapter;
import com.example.freebird.presentation.ui.downloads.model.CardModel;
import com.example.freebird.presentation.ui.home.adapter.BookMarkAdapter;
import com.example.freebird.presentation.ui.home.adapter.HomeFeatureAdapter;
import com.example.freebird.presentation.ui.home.adapter.HomeRecentAdapter;
import com.example.freebird.presentation.ui.home.adapter.SideMenuAdapter;
import com.example.freebird.presentation.ui.home.model.BookmarkItem;
import com.example.freebird.presentation.ui.home.model.HeaderModel;
import com.example.freebird.presentation.ui.home.model.RecentModel;
import com.example.freebird.presentation.ui.home.model.SideMenuModel;
import com.example.freebird.presentation.ui.listing.adapter.AvailableCardAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseFragment<com.example.freebird.databinding.FragmentHomeBinding> implements BookMarkAdapter.OnClickButton, AvailableCardAdapter.OnClickItem {

    BookMarkAdapter adapter;
    List<BookmarkItem> list;
    HeaderModel headerModel;
    HomeRecentAdapter recentAdapter;
    List<RecentModel> recentModelList;
    HomeFeatureAdapter featureAdapter;
    Utils utils;
    PopupWindow popupWindow;
    RecyclerView recyclerView;
    List<SideMenuModel> sideMenuModels;
    SideMenuAdapter sideMenuAdapter;
    @Override
    public void initToolbar() {
        binding.toolbar.btnBack.setImageResource(R.drawable.hoem_icon);
        binding.toolbar.notifyText.setVisibility(View.VISIBLE);
        binding.toolbar.btnMore.setVisibility(View.VISIBLE);
        binding.toolbar.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupDialog(v);
                binding.rootLayout.setVisibility(View.VISIBLE);
            }
            private void showPopupDialog(View v) {
                popupWindow.showAtLocation(v, Gravity.END, 0, -80);


            }
        });
    }

    @Override
    public void setupView() {
        list = new ArrayList<>();
        utils = new Utils();
       setBookMarkAdapter();
       setRecentAdapter();
       setFeatureAdapter();
       setSideMenu();
       onClickListener();
    }

    private void onClickListener() {
       binding.rootLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               popupWindow.dismiss();
               binding.rootLayout.setVisibility(View.GONE);
           }
       });

    }

    private void setSideMenu() {
        View popupView = LayoutInflater.from(getContext()).inflate(R.layout.popup_menu_layout, null);
        int width = 200; // 200dp
        int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        popupWindow = new PopupWindow(popupView, 500, height);
        recyclerView = popupView.findViewById(R.id.rvMenu);
        utils = new Utils();
        sideMenuModels = utils.getSidemenutemList();
        sideMenuAdapter = new SideMenuAdapter(getContext(),sideMenuModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(sideMenuAdapter);
        // Set a background color for the popup window
        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.rounded_bottom_layout));
    }

    private void setFeatureAdapter() {
        featureAdapter = new HomeFeatureAdapter(getContext());
        binding.viewPager.setClipToPadding(false);
        binding.viewPager.setClipChildren(false);
        binding.viewPager.setOffscreenPageLimit(3);
        binding.viewPager.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.95f + r * 0.05f );

            }
        });
        binding.viewPager.setPageTransformer(compositePageTransformer);
        binding.viewPager.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        binding.viewPager.setOrientation(binding.viewPager.ORIENTATION_HORIZONTAL);
        binding.viewPager.setAdapter(featureAdapter);

    }


    private void setRecentAdapter() {
        headerModel = new HeaderModel("Most Recent","See all");
        binding.layoutHeader.tvTitle.setText(headerModel.getTvTile());
        binding.layoutHeader.tvAction.setText(headerModel.getTvAction());
        binding.layoutFeature.tvTitle.setText("Features");
        binding.layoutHeader.tvAction.setText("Details");
        recentModelList = new ArrayList<>();
        recentModelList = utils.getRecentItemList();
        recentAdapter = new HomeRecentAdapter(getContext(),recentModelList);
        binding.rvRecent.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.rvRecent.setHasFixedSize(true);
        binding.rvRecent.setAdapter(recentAdapter);

    }

    private void setBookMarkAdapter() {
        list = utils.getBookmarkItemList();
        adapter = new BookMarkAdapter(getContext(),list,this::onClick);
        binding.rv.setLayoutManager(new GridLayoutManager(getContext(),4));
        binding.rv.setAdapter(adapter);
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }


    @Override
    public void onClick(int pos) {
        popupWindow.dismiss();
        if(pos==5){

        }


    }
}