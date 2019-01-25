package com.example.lenovo.vsproject.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.Toolbar;
import com.example.lenovo.vsproject.R;

public class CartFragment extends Fragment {

    Toolbar toolbar;
    RecyclerView cartRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_cart, null);
        toolbar=(Toolbar)view.findViewById(R.id.cart_toolbar);
        cartRecyclerView=(RecyclerView)view.findViewById(R.id.cart_recycler);

        return view;
    }
}