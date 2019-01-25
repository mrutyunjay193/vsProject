package com.example.lenovo.vsproject.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lenovo.vsproject.Fragment.ClothCatagoriFive;
import com.example.lenovo.vsproject.Fragment.ClothCatagoriFour;
import com.example.lenovo.vsproject.Fragment.ClothCatagoriOne;
import com.example.lenovo.vsproject.Fragment.ClothCatagoriThree;
import com.example.lenovo.vsproject.Fragment.ClothCatagoriTwo;

public class PagerAdapter extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public PagerAdapter(FragmentManager fm, int tabCount) {
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
                ClothCatagoriOne tab1 = new ClothCatagoriOne();
                return tab1;
            case 1:
                ClothCatagoriTwo tab2 = new ClothCatagoriTwo();
                return tab2;
            case 2:
                ClothCatagoriThree tab3 = new ClothCatagoriThree();
                return tab3;
            case 3:
                ClothCatagoriFour tab4 =new ClothCatagoriFour();
                return tab4;
            case 4:
                ClothCatagoriFive tab5=new ClothCatagoriFive();
                return tab5;
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