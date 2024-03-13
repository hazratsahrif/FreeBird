package com.example.freebird.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.freebird.tabs.CompleteFragment;
import com.example.freebird.tabs.InprogressFragment;

public class DownloadPagerAdapter extends FragmentStateAdapter {
    public DownloadPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new InprogressFragment();
        }
        else if (position == 1)
        {
            fragment = new CompleteFragment();
        }

        return fragment ;
    }

    @Override
    public int getItemCount() {
        return 2;
    }


}
