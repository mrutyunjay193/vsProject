package com.example.lenovo.vsproject.Fragment;

import android.content.Intent;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.lenovo.vsproject.Model.User;
import com.example.lenovo.vsproject.R;
import com.example.lenovo.vsproject.SharedPrefManager;

          public class UserDetails extends Fragment   {


              @Override
              public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
                  View v = inflater.inflate(R.layout.user_info, container, false);

        if (!SharedPrefManager.getInstance(getContext()).isLoggedIn()) {
            Fragment fragment= new FragmentProfile();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment); // fragment container id in first parameter is the  container(Main layout id) of Activity
            transaction.addToBackStack(null);  // this will manage backstack
            transaction.commit();

        }

        TextView textViewName, textViewEmail, textViewPass;
        textViewName=v.findViewById(R.id.text_view_userinfo1);
        textViewPass=v.findViewById(R.id.text_view_userinfo2);
        textViewEmail=v.findViewById(R.id.text_view_userinfo3);
        ScrollView scroolview=v.findViewById(R.id.scroolviewuserinfo);
        TextView logout=v.findViewById(R.id.logout_text);
        LinearLayout logt=v.findViewById(R.id.linear_logout);

        logt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPrefManager.getInstance(getContext()).logout();

            }
        });
//getting the current user
        User user = SharedPrefManager.getInstance(getContext()).getUser();
        //setting the values to the textviews
        textViewName.setText(user.getUsername());
        textViewEmail.setText(user.getEmail());
       return v;
             }


          }
