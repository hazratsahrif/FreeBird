package com.example.freebird.presentation.ui.auth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.freebird.R;
import com.example.freebird.databinding.FragmentSignInBinding;
import com.example.freebird.presentation.ui.base.BaseFragment;

public class SignInFragment extends BaseFragment<FragmentSignInBinding> {
    @Override
    public void initToolbar() {
        // TODO: No toolbar in this fragment
    }

    @Override
    public void setupView() {
        String text = "Don't have an account? Sign Up now";
        SpannableString spannableString = new SpannableString(text);

// Set color and click event to 'Sign Up now'
        int startIndex = text.indexOf("Sign Up now");
        int endIndex = startIndex + "Sign Up now".length();

// Set color to orange
        ForegroundColorSpan orangeColorSpan = new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.orange)); // replace R.color.orange with your actual orange color resource
        spannableString.setSpan(orangeColorSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

// Set click event
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Handle click event here, e.g. start sign up activity
                Toast.makeText(requireContext(), "Sign Up now clicked", Toast.LENGTH_SHORT).show();
            }
        };
        spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

// Set the SpannableString to the TextView
        binding.tvSignUp.setText(spannableString);

// Make the TextView clickable
        binding.tvSignUp.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public void observeData() {

    }

    @Override
    public void fetchData() {

    }
}