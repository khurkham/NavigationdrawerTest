package com.android.khurkham.tailanguage.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.khurkham.tailanguage.R;
import com.android.khurkham.tailanguage.infrastructure.AppSection;

/**
 * Created by Khurkham Langkhur.
 */



public class FragmentCategories extends MyAppFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_categories, container, false);



        getMainActivity().getSupportActionBar().setTitle("Categories");

        return view;

    }

}
