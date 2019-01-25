package com.example.lenovo.vsproject.Adapter;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.lenovo.vsproject.Activity.DetailsActivity;
import com.example.lenovo.vsproject.Model.ProductList;
import com.example.lenovo.vsproject.R;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    //this will inflate the layout
    private Context mCtx;
    //storing all the product in a list
    private List<ProductList> productLists;

    //getting context and product list with constructor
    public ListAdapter(Context mCtx, List<ProductList> productLists) {
        this.mCtx=mCtx;
        this.productLists=productLists;
    }





    @NonNull
    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.list_item,null);
        final MyViewHolder viewHolder=new MyViewHolder(view);
        // cliclklistner
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mCtx,DetailsActivity.class);
                i.putExtra("cart_name",productLists.get(viewHolder.getAdapterPosition()).getName());
                i.putExtra("crat_brand",productLists.get(viewHolder.getAdapterPosition()).getBrand());
                i.putExtra("cart_price",productLists.get(viewHolder.getAdapterPosition()).getPrice());
                i.putExtra("cart_image",productLists.get(viewHolder.getAdapterPosition()).getImage());
                mCtx.startActivity(i);

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.MyViewHolder myViewHolder, int position) {
        ProductList productList=productLists.get(position);
        myViewHolder.name.setText(productList.getName());
        myViewHolder.brand.setText(productList.getBrand());
        myViewHolder.price.setText(String.valueOf(productList.getPrice()) );
        myViewHolder.image.setImageDrawable(mCtx.getResources().getDrawable(productList.getImage()));

    }

    @Override
    public int getItemCount() {
        return productLists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name,brand,price;
        ImageView image;
        RelativeLayout view_container;
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            image = (ImageView) itemView.findViewById(R.id.image);
            brand=(TextView) itemView.findViewById(R.id.sub_name);
            price=(TextView) itemView.findViewById(R.id.price);
            view_container=(RelativeLayout)itemView.findViewById(R.id.cloth_container);
        }
    }
}



