package com.example.freebird.presentation.ui.settings;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.freebird.databinding.FragmentSettingsBinding;

public class SettingsFragment extends Fragment {

    FragmentSettingsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        init();
        return binding.getRoot();
    }

    private void init() {
        initToolbar();

        binding.layoutDownloadLocation.tvTitle.setText("Download Location");
        binding.layoutDownloadLocation.tvSubtitle.setText("/Storage/emulated/0/Movies/DownloadHub");

        binding.layoutSearchEngine.tvTitle.setText("Search Engine");
        binding.layoutSearchEngine.tvSubtitle.setText("Google.com");

        binding.layoutCookies.tvTitle.setText("Cookies Settings");
        binding.layoutCookies.tvSubtitle.setText("Allow Cookies");

        binding.layoutVideoPlayer.tvTitle.setText("Web Video Player Orientation");
        binding.layoutVideoPlayer.tvSubtitle.setText("Default");


        binding.layoutAppLock.tvTitle.setText("App Lock");
        binding.layoutSafeBrowsing.tvTitle.setText("Safe Browsing");
        binding.layoutWebsiteBlocker.tvTitle.setText("Harmful Website Blocker");

        binding.layoutClearCookies.tvTitle.setText("Cookies");
        binding.layoutClearCookies.tvSubtitle.setVisibility(View.GONE);
        binding.layoutClearCookies.tvAction.setText("Clear");

        binding.layoutFeedback.tvTitle.setText("Feedback");
        binding.layoutConsent.tvTitle.setText("Consent");
        binding.layoutPrivacyPolicy.tvTitle.setText("Privacy Policy");
        binding.layoutContactUs.tvTitle.setText("Contact Us");



    }

    private void initToolbar() {
        binding.toolbar.tvTitle.setText("Settings");
        binding.toolbar.layoutActions.setVisibility(View.GONE);
    }

    @Override
    public void onDestroy() {
        binding = null;
        super.onDestroy();
    }
}