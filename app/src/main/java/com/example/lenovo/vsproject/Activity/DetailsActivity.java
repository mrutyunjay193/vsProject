package com.example.lenovo.vsproject.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lenovo.vsproject.Fragment.CartFragment;
import com.example.lenovo.vsproject.Fragment.UserDetails;
import com.example.lenovo.vsproject.R;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {
    TextView buynow,addtocart;


Toolbar addToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_addtocart);
        addToolbar=findViewById(R.id.add_toolbar);
        buynow=findViewById(R.id.buy_now);
        addtocart=findViewById(R.id.add_to_cart);
        setSupportActionBar(addToolbar);
        addToolbar.setTitle("Catagories");
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
            initList();

    }

    private void initList() {
        buynow.setOnClickListener(this);
        addtocart.setOnClickListener(this);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buy_now:
                // to do link with rezeropay

                break;
            case R.id.add_to_cart:
               // to do



                break;
        }
    }
}