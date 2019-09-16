package com.example.sanjoth.itemsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);


         ArrayList<String> Slist = new ArrayList<>(5);
        ArrayList<String> Slist1 = new ArrayList<>(5);
        ArrayList<String> Slist2 = new ArrayList<>(5);


        Slist.add("PUR-2019-056");
        Slist1.add("06-jul-2019");
        Slist2.add("Approved");


        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),Slist,Slist1,Slist2);
        listView.setAdapter(listAdapter);





    }
}
