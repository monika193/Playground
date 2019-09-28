package com.example.sanjoth.newmyrequest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.sanjoth.newmyrequest.Global.RequestStatus;
import com.example.sanjoth.newmyrequest.Model.RequestModel;
import com.example.sanjoth.newmyrequest.delegates.DelegateForm;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements DelegateForm {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListFragment myfragment=new ListFragment();
        myfragment.setDelegateForm(this);
        android.support.v4.app.FragmentManager fm =getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragment,myfragment);
        ft.commit();


    }

    @Override
    public void onclickRequestItem(RequestModel requestModel) {
        int i =0;
        ViewFragment myfragment = new ViewFragment();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fragment2,myfragment);
        ft.commit();


    }
}



