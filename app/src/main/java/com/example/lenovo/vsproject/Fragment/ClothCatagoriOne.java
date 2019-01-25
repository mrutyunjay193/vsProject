package com.example.lenovo.vsproject.Fragment;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.vsproject.Adapter.ListAdapter;
import com.example.lenovo.vsproject.Model.ProductList;
import com.example.lenovo.vsproject.R;

import java.util.ArrayList;
import java.util.List;

public class ClothCatagoriOne extends Fragment {
    List<ProductList> productLists;

    public ClothCatagoriOne() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.men_recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        //intializing the product list
        productLists =new ArrayList<>();



        //adding items


        productLists.add(new ProductList("t_shirt",R.drawable.image1,"american",4555));
        productLists.add(new ProductList("trp_shirt",R.drawable.image2,"americank",455));
        productLists.add(new ProductList("tv_shirt",R.drawable.image3,"americanjndj",450));
        productLists.add(new ProductList("tc_shirt",R.drawable.image4,"americandncjn",45));
        productLists.add(new ProductList("tc_shirt",R.drawable.image5,"americannd",500));
        productLists.add(new ProductList("tcc_shirt",R.drawable.image7,"americanndn",400));
        productLists.add(new ProductList("tvv_shirt",R.drawable.image8,"americankdkn",700));
        productLists.add(new ProductList("thh_shirt",R.drawable.image9,"americanknd",600));
        productLists.add(new ProductList("tnn_shirt",R.drawable.image10,"americandnk",200));
        productLists.add(new ProductList("tjjjj_shirt",R.drawable.image8,"americandk",300));

        ListAdapter customAdapter = new ListAdapter(getActivity(),productLists);
        recyclerView.setAdapter(customAdapter);
        
        return view;

    }
}
