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
public class Menubooks1 extends MyAppFragment {
    private Button gotoItemDetailsButton;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_menubooks1, container, false);
        gotoItemDetailsButton = (Button)view.findViewById(R.id.categories_goto_items);
        gotoItemDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMainActivity().navigateToSection(AppSection.ITEMS, true);
            }
        });
        getMainActivity().getSupportActionBar().setTitle("Menubooks1");

        return view;
    }
}