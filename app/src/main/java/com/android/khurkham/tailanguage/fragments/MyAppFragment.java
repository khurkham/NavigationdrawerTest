package com.android.khurkham.tailanguage.fragments;

import android.support.v4.app.Fragment;

import com.android.khurkham.tailanguage.MainActivity;

/**
 * Created by Khurkham Langkhur.
 */

public abstract class MyAppFragment extends Fragment {
    /**
     * get a unique string identifier for this fragment. Can be used as a key to add
     * into the back stack
     *
     * @return unique tag
     */
    public String getFragmentTag() {
        return this.getClass().getSimpleName();
    }

    /**
     * obtain the current instance of the activity holding this fragment
     * @return main activity instance
     */
    public MainActivity getMainActivity() {
        return (MainActivity) getActivity();
    }
}
