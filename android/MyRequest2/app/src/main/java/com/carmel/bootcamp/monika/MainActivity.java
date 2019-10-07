package com.carmel.bootcamp.monika;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.carmel.bootcamp.monika.Delegate.MyRequestDelegate;
import com.carmel.bootcamp.monika.Model.RequestModel;

public class MainActivity extends AppCompatActivity implements MyRequestDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyRequestFragment myRequestFragment=new MyRequestFragment();
        myRequestFragment.setMyrequestDelegate(this);
        android.support.v4.app.FragmentManager fm =getSupportFragmentManager();
        fm.popBackStackImmediate(null,fm.POP_BACK_STACK_INCLUSIVE);
        android.support.v4.app.FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.framelayout,myRequestFragment);
        ft.commit();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            RequestViewFragment requestViewFragment = new RequestViewFragment();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.framelayout, requestViewFragment);
            ft.addToBackStack(null);
            ft.commit();


        } else {
            RequestViewFragment requestViewFragment = new RequestViewFragment();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.linear, requestViewFragment);
            ft.addToBackStack(null);
            ft.commit();

        }
    }

    @Override
    public void onclickRequestItem(RequestModel requestModel) {
        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            RequestViewFragment requestViewFragment = new RequestViewFragment();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.framelayout, requestViewFragment);
            ft.addToBackStack(null);
            ft.commit();
            requestViewFragment.setDatafetching(requestModel);

        } else {
            RequestViewFragment requestViewFragment = new RequestViewFragment();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            fm.popBackStackImmediate(null, fm.POP_BACK_STACK_INCLUSIVE);
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.linear, requestViewFragment);
            ft.addToBackStack(null);
            ft.commit();
            requestViewFragment.setDatafetching(requestModel);

        }

    }
}

