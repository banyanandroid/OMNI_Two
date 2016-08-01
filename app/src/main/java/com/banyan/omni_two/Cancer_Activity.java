package com.banyan.omni_two;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.banyan.omni_two.Fragments.Fragment_1;
import com.banyan.omni_two.Fragments.Fragment_17;
import com.banyan.omni_two.Fragments.Fragment_18;
import com.banyan.omni_two.Fragments.Fragment_19;
import com.banyan.omni_two.Fragments.Fragment_2;
import com.banyan.omni_two.Fragments.Fragment_20;
import com.banyan.omni_two.Fragments.Fragment_21;
import com.banyan.omni_two.Fragments.Fragment_22;
import com.banyan.omni_two.Fragments.Fragment_23;
import com.banyan.omni_two.Fragments.Fragment_24;
import com.banyan.omni_two.Fragments.Fragment_25;
import com.banyan.omni_two.Fragments.Fragment_27;
import com.banyan.omni_two.Fragments.Fragment_28;
import com.banyan.omni_two.Fragments.Fragment_29;
import com.banyan.omni_two.Fragments.Fragment_3;
import com.banyan.omni_two.Fragments.Fragment_30;
import com.banyan.omni_two.Fragments.Fragment_31;
import com.banyan.omni_two.Fragments.Fragment_32;
import com.banyan.omni_two.Fragments.Fragment_33;
import com.banyan.omni_two.Fragments.Fragment_34;


public class Cancer_Activity extends FragmentActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    static final int ITEMS = 9;
    //TextView one, two, three, four, five, six, seven, eight, nine;
    MyAdapter mAdapter;
    ViewPager mPager;

    //MediaPlayer player;
    //AssetFileDescriptor afd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancer_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        mAdapter = new MyAdapter(getSupportFragmentManager());
        mPager = (ViewPager) findViewById(R.id.pager);

        mPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


        mPager.setAdapter(mAdapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //sng();
    }


    MediaPlayer player;
    AssetFileDescriptor afd;


    public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }


        @Override
        public int getCount() {
            return ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show image
                    return Fragment_27.init(position);
                case 1: // Fragment # 1 - This will show image
                    return Fragment_28.init(position);
                case 2: // Fragment # 2 - This will show image
                    return Fragment_29.init(position);
                case 3: // Fragment # 0 - This will show image
                    return Fragment_30.init(position);
                case 4: // Fragment # 1 - This will show image
                    return Fragment_31.init(position);
                case 5: // Fragment # 2 - This will show image
                    return Fragment_32.init(position);
                case 6: // Fragment # 0 - This will show image
                    return Fragment_33.init(position);
                case 7: // Fragment # 1 - This will show image
                    return Fragment_34.init(position);


                default:// Fragment # 2-9 - Will show list
                    return null;
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    public void onPause() {
        super.onPause();
        //player.stop();
    }

    //To resume this player we have to call following method.
    public void onResume() {
        super.onResume();
        //sng();
        //player.start();

    }

    // activity is going to stop we have to call this to release the media player
    protected void onStop() {
        super.onStop();
        //player.stop();
        //player = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_preg) {
            // Handle the CurONC action
            Intent in = new Intent(this, Pregnancy_Activity.class);
            startActivity(in);
        } else if (id == R.id.nav_diab) {
            //Handle the Ultr Action
            Intent in = new Intent(this, Diabetes_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_cancer) {
            // Handle the IBS/IBD action
            Intent in = new Intent(this, Cancer_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_rp) {
            // Handle the Phych action
            Intent in = new Intent(this, Radio_Activity.class);
            startActivity(in);

        } else if (id == R.id.nav_ai) {
            // Handle the Neuro action
            Intent in = new Intent(this, Anti_Inflamation_Activity.class);
            startActivity(in);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
