package com.example.lenovo.vsproject.Adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lenovo.vsproject.Fragment.FrameCrystal;
import com.example.lenovo.vsproject.Fragment.FrameGlass;
import com.example.lenovo.vsproject.Fragment.FrameWooden;
import com.example.lenovo.vsproject.Fragment.HandleDesign;
import com.example.lenovo.vsproject.Fragment.ImagePrint;
import com.example.lenovo.vsproject.Fragment.MagicalMug;
import com.example.lenovo.vsproject.Fragment.TextPrint;

public class FramesAdapter extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public FramesAdapter(FragmentManager fm, int tabCount) {
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
                FrameGlass tab1 = new FrameGlass();
                return tab1;
            case 1:
                FrameWooden tab2 = new FrameWooden();
                return tab2;
            case 2:
                FrameCrystal tab3 = new FrameCrystal();
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
