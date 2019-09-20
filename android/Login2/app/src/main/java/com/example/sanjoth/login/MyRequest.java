package com.example.sanjoth.login;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sanjoth.login.Global.RequestStatus;
import com.example.sanjoth.login.Model.RequestModel;

import java.util.ArrayList;

import static com.example.sanjoth.login.R.layout.popupmenu;

public class MyRequest extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
         ListPopupWindow listPopupWindow;
         ListView listView;
           ImageView filter;
//           ListView listView;
           Button button;
           ImageView imageview;
//           ImageView imageView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_request);
        button=findViewById(R.id.button3);
//        imageview=findViewById(R.id.image);




        ImageView filter=(ImageView)findViewById(R.id.imageView7);
        listPopupWindow=new  android.widget.ListPopupWindow(getApplicationContext());
        final TextView listpopup=(TextView)findViewById(R.id.popuptext);
        final ListView listView=(ListView)findViewById(R.id.listview);


//
//       ArrayList<String> Slist = new ArrayList<>(5);
//        ArrayList<String> Slist1 = new ArrayList<>(5);
//        ArrayList<String> Slist2 = new ArrayList<>(5);
        final ArrayList<RequestModel> requestList=new ArrayList<>();

//        ArrayList<RecyclerView> recyclerViews=new ArrayList<>();
//        final ArrayList<String> requisition = new ArrayList<>();


        RequestModel requestModel= new RequestModel();

        requestModel.setRequestNumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.Approved);
        requestModel.setDescription("07-jul-2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-057");
        requestModel.setRequestStatus(RequestStatus.Draft);
        requestModel.setDescription("08-jul-2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-058");
        requestModel.setRequestStatus(RequestStatus.Rejected);
        requestModel.setDescription("09-jul-2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-059");
        requestModel.setRequestStatus(RequestStatus.Awaiting);
        requestModel.setDescription("10-jul-2019");
        requestList.add(requestModel);






//        Slist.add("PUR-2019-056");
//        Slist1.add("06-jul-2019");
//        Slist2.add("Approved");
//
//
//        Slist.add("PUR-2019-056");
//        Slist1.add("06-jul-2019");
//        Slist2.add("Approved");
//
//
//        Slist.add("PUR-2019-056");
//        Slist1.add("06-jul-2019");
//        Slist2.add("Approved");
//

        MyListAdapter listAdapter=new MyListAdapter(getApplicationContext(),requestList);
        listView.setAdapter(listAdapter);
//        String[] items_list={"CLEAR","APPROVED","AWAITING","DRAFT","REJECTED"};
//        String[] items={"CLEAR","APPROVED","AWAITING","DRAFT","REJECTED"};


//        ListAdapter adapter=new ArrayAdapter<>(getApplicationContext(),popupmenu,items_list);
//        listView.setAdapter(adapter);
//        int items_list = 0;


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                RequestModel request =  requestList.get(i);
//                Intent intent=new Intent(MyRequest.this,Requisition1.class);
//               startActivity(intent);
//                String value = "Hello World!";

               Intent intent = new Intent(getApplicationContext(), DemoClass.class);
               Bundle requestDataBundel =new Bundle();
               requestDataBundel.putString("RequestNumber",request.getRequestNumber());
               requestDataBundel.putString("RequestDescription",request.getDescription());
               requestDataBundel.putString("RequestStatus",request.getRequestStatus().toString());
//               intent.putExtra("sample_name", value);
//                startActivity(intent);
//                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.putExtra("request",requestDataBundel);
                startActivity(intent);




            }
        });
//

            listPopupWindow.setAdapter(new ArrayAdapter<>(getApplicationContext(),R.layout.popupmenu));
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
              Intent intent=new Intent(getApplicationContext(),Requisition1.class);
               startActivity(intent);


            }
        });





//        listView=findViewById(R.id.listview);
//        String title[]={"PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056","PUR - 2019 - 056"};
//        String date[]={"22-Aug-2019","24-Aug-2019","28-Aug-2019","30-Aug-2019","2-Sep-2019"};
//        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};
// String statusColors
//        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),title,date,status);
//        listView.setAdapter(listAdapter);




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