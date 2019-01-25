package com.example.lenovo.vsproject.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.lenovo.vsproject.Activity.AccessoriesActivity;
import com.example.lenovo.vsproject.Activity.ClothActivity;
import com.example.lenovo.vsproject.Activity.FramesActivity;
import com.example.lenovo.vsproject.Activity.MugsActivity;
import com.example.lenovo.vsproject.Activity.TableTopsActivity;
import com.example.lenovo.vsproject.R;

/**
 * Created by Belal on 1/23/2018.
 */

public class HomeFragment extends Fragment  {

    CardView CardCloth,CardMugs,CardFrames,CardTableTops,CardAccessories;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragmet_home, null);

        CardCloth=(CardView)v.findViewById(R.id.cardClothId);
        CardMugs=(CardView)v.findViewById(R.id.cardMugs);
        CardFrames=(CardView)v.findViewById(R.id.cardFrames);
        CardTableTops=(CardView)v.findViewById(R.id.cardTableTops);
        CardAccessories=(CardView)v.findViewById(R.id.cardAccessories);
       CardCloth.setOnClickListener(new View.OnClickListener() {
          @Override
         public void onClick(View v) {
          Intent i=new Intent(getActivity(),ClothActivity.class);
             startActivity(i);
            }
       });
       CardMugs.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getActivity(),MugsActivity.class);
               startActivity(i);

           }
       });
        CardFrames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),FramesActivity.class);
                startActivity(i);

            }
        });
        CardTableTops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),TableTopsActivity.class);
                startActivity(i);

            }
        });
        CardAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),AccessoriesActivity.class);
                startActivity(i);

            }
        });

        return v;


    }

    }

