package com.android.khurkham.tailanguage.infrastructure;

import com.android.khurkham.tailanguage.fragments.FragmentCategories;
import com.android.khurkham.tailanguage.fragments.FragmentHome;
import com.android.khurkham.tailanguage.fragments.FragmentItem;
import com.android.khurkham.tailanguage.fragments.FragmentUsers;
import com.android.khurkham.tailanguage.fragments.Menubooks1;
import com.android.khurkham.tailanguage.fragments.Menubooks2;
import com.android.khurkham.tailanguage.fragments.Menubooks3;
import com.android.khurkham.tailanguage.fragments.Menubooks4;
import com.android.khurkham.tailanguage.fragments.Menubooks5;
import com.android.khurkham.tailanguage.fragments.Menubooks6;
import com.android.khurkham.tailanguage.fragments.MyAppFragment;
import com.android.khurkham.tailanguage.fragments.Send;
import com.android.khurkham.tailanguage.fragments.Share;

/**
 * Created by Khurkham Langkhur.
 */

public class MyAppFragmentFactory {

    public static MyAppFragment getFragment(AppSection section) {
        switch (section) {
            case HOME:
                return new FragmentHome();
            case Menubooks1:
                return new Menubooks1();
            case Menubooks2:
                return new Menubooks2();
            case Menubooks3:
                return new Menubooks3();
            case Menubooks4:
                return new Menubooks4();
            case Menubooks5:
                return new Menubooks5();
            case Menubooks6:
                return new Menubooks6();
            case Send:
                return new Send();
            case Share:
                return new Share();

            case USERS:
                return new FragmentUsers();
            case CATEGORIES:
                return new FragmentCategories();
            case ITEMS:
                return new FragmentItem();
            default:
                return null;
        }
    }
}
