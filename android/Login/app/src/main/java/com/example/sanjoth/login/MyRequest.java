package com.example.sanjoth.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.sanjoth.login.R.layout.popupmenu;

public class MyRequest extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
         ListPopupWindow listPopupWindow;
//         ListView listView;
           ImageView filter;
           ListView listView;
           Button button;
           ImageView imageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_request);
        button=findViewById(R.id.button3);




        ImageView filter=(ImageView)findViewById(R.id.imageView7);
        listPopupWindow=new  android.widget.ListPopupWindow(getApplicationContext());
        final TextView listpopup=(TextView)findViewById(R.id.popuptext);
//        listView=findViewById(R.id.listview);
        String[] items_list={"CLEAR","APPROVED","AWAITING","DRAFT","REJECTED"};
        String[] items={"CLEAR","APPROVED","AWAITING","DRAFT","REJECTED"};


//        ListAdapter adapter=new ArrayAdapter<>(getApplicationContext(),popupmenu,items_list);
//        listView.setAdapter(adapter);
        listPopupWindow.setAdapter(new ArrayAdapter<>(getApplicationContext(),R.layout.popupmenu,items_list));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                listPopupWindow.show();

                                            }
                                        });
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),recycleview.class);
                startActivity(intent);
            }
        });



        listView=findViewById(R.id.listview);
        String title[]={"PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056"};
        String date[]={"22-Aug-2019","24-Aug-2019","28-Aug-2019","30-Aug-2019","2-Sep-2019"};
        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};
// String statusColors
        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),title,date,status);
        listView.setAdapter(listAdapter);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_request, menu);
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}