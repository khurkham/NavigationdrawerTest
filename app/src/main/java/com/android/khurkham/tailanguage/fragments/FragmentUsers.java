package com.android.khurkham.tailanguage.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.khurkham.tailanguage.R;

/**
 * Created by Khurkham Langkhur.
 */
public class FragmentUsers extends MyAppFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_users, container, false);

        getMainActivity().getSupportActionBar().setTitle("Users");

        return view;
    }
}
