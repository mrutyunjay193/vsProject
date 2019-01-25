package com.example.lenovo.vsproject.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.lenovo.vsproject.Fragment.ImagePrint;
import com.example.lenovo.vsproject.Fragment.MagicalMug;
import com.example.lenovo.vsproject.Fragment.TextPrint;

public class MugsAdapter extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public MugsAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                ImagePrint tab1 = new ImagePrint();
                return tab1;
            case 1:
                TextPrint tab2 = new TextPrint();
                return tab2;
            case 2:
                MagicalMug tab3=new MagicalMug();
                return tab3;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }

}
