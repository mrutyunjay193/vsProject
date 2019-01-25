package com.example.lenovo.vsproject.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lenovo.vsproject.Fragment.AccessoriesCushion;
import com.example.lenovo.vsproject.Fragment.AccessoriesKeyChain;
import com.example.lenovo.vsproject.Fragment.AccessoriesMobileCover;
import com.example.lenovo.vsproject.Fragment.AccessoriesPen;
import com.example.lenovo.vsproject.Fragment.AccessoriesPrintedPendant;
import com.example.lenovo.vsproject.Fragment.AccessoriesWatch;
import com.example.lenovo.vsproject.Fragment.ImagePrint;
import com.example.lenovo.vsproject.Fragment.MagicalMug;
import com.example.lenovo.vsproject.Fragment.TextPrint;

public class AccessoriesAdapter extends FragmentStatePagerAdapter {
    int tabCount;
    public AccessoriesAdapter(FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AccessoriesPen tab1 = new AccessoriesPen();
                return tab1;
            case 1:
                AccessoriesWatch tab2 = new AccessoriesWatch();
                return tab2;
            case 2:
                AccessoriesKeyChain tab3=new AccessoriesKeyChain();
                return tab3;
            case 3:
                AccessoriesCushion tab4=new AccessoriesCushion();
                return tab4;
            case 4:
                AccessoriesMobileCover tab5=new AccessoriesMobileCover();
                return tab5;
            case 5:
                AccessoriesPrintedPendant tab6=new AccessoriesPrintedPendant();
                return tab6;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
