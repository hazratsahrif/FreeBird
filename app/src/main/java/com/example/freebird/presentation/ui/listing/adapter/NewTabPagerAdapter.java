package com.example.freebird.presentation.ui.listing.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.freebird.presentation.ui.downloads.tabs.CompleteFragment;
import com.example.freebird.presentation.ui.downloads.tabs.InprogressFragment;
import com.example.freebird.presentation.ui.listing.tabs.all.AllTabFragment;
import com.example.freebird.presentation.ui.listing.tabs.book.BookTabFragment;
import com.example.freebird.presentation.ui.listing.tabs.video.VideoTabFragment;

public class NewTabPagerAdapter extends FragmentStateAdapter {
    public NewTabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new AllTabFragment();
        }
        else if (position == 1)
        {
            fragment = new BookTabFragment();
        }
        else if (position == 2)
        {
            fragment = new VideoTabFragment();
        }
        else if (position == 3)
        {
            fragment = new BookTabFragment();
        }
        else if (position == 4)
        {
            fragment = new BookTabFragment();
        }
        else if (position == 5)
        {
            fragment = new BookTabFragment();
        }




        return fragment ;
    }

    @Override
    public int getItemCount() {
        return 6;
    }


}
