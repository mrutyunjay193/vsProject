package com.example.lenovo.vsproject.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lenovo.vsproject.Fragment.FrameGlass;
import com.example.lenovo.vsproject.Fragment.FrameWooden;
import com.example.lenovo.vsproject.Fragment.TableTopCrystal;
import com.example.lenovo.vsproject.Fragment.TableTopGlass;
import com.example.lenovo.vsproject.Fragment.TableTopWooden;

public class TableTopAdapter extends FragmentStatePagerAdapter {
    //integer to count number of tabs
    int tabCount;
    //Constructor to the class
    public TableTopAdapter(FragmentManager fm, int tabCount) {
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
                TableTopWooden tab1 = new TableTopWooden();
                return tab1;
            case 1:
                TableTopGlass tab2 = new TableTopGlass();
                return tab2;
            case 2:
                TableTopCrystal tab3 = new TableTopCrystal();
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
