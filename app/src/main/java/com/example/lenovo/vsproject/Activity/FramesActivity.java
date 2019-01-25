package com.example.lenovo.vsproject.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.lenovo.vsproject.Adapter.FramesAdapter;
import com.example.lenovo.vsproject.R;

public class FramesActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
        private ViewPager framesviewPager;
        Toolbar toolbar;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frames_subcatagories);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.frames_tabLayout);
        toolbar=(Toolbar)findViewById(R.id.frames_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Frames");
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("Wooden Frame"));
        tabLayout.addTab(tabLayout.newTab().setText("Glass Frames"));
        tabLayout.addTab(tabLayout.newTab().setText("Crystal Frames"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //Initializing viewPager
        framesviewPager = (ViewPager) findViewById(R.id.frames_pager);

        //Creating our pager adapter
        FramesAdapter adapter = new FramesAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        //Adding adapter to pager
        framesviewPager.setAdapter(adapter);


        //Adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(this);
        framesviewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()){
            case R.id.action_search:
                //to do
                Toast.makeText(this, "You clicked search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_filter:
                //to do
                Toast.makeText(this, "You clicked filter", Toast.LENGTH_SHORT).show();
                break;
        }



        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        framesviewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
