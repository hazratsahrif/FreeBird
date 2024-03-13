package com.example.freebird;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.example.freebird.adapter.DownloadPagerAdapter;
import com.example.freebird.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    DownloadPagerAdapter myPagerAdapter;
    PopupMenu popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initTabs();

        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(v);
            }
        });
    }

    private void showPopup(View v) {
        binding.toolbar.setPopupTheme(R.style.PopupMenu);
        popup = new PopupMenu(MainActivity.this, v, Gravity.CENTER_HORIZONTAL);
        Context wrapper = new ContextThemeWrapper(MainActivity.this, R.style.PopupMenu);
        popup = new PopupMenu(wrapper, v);
        popup.getMenuInflater().inflate(R.menu.donwnalod_menu, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                SpannableString s = new SpannableString(item.getTitle());
                s.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
                item.setTitle(s);
                Toast.makeText(MainActivity.this, "Text " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        popup.show();
    }

    private void initTabs() {
        ViewPager2 viewPager = findViewById(R.id.vp_landing);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabLayout.Tab tab1 = tabLayout.newTab();
        TabLayout.Tab tab2 = tabLayout.newTab();
        tab1.setText("In Progress");
        tab2.setText("Completed");
        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);

        myPagerAdapter = new DownloadPagerAdapter(this);
        // Set the adapter on the ViewPager
        viewPager.setAdapter(myPagerAdapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            List<String> tabNames = Arrays.asList("In Progress", "Completed");
            tab.setText(tabNames.get(position));
        });
        tabLayoutMediator.attach();

    }
}