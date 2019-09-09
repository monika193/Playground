package com.example.sanjoth.activityinterface;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class DemoInterfaceClass {
    private Context activity;


    DemoInterfaceClass(){

    }
    public void  interfacemethod(){
        Log.d("interfacemethod", "interfacemethod: This message from DemoInterfaceClass ");
        Toast t=Toast.makeText(activity.getApplicationContext()," This message from DemoInterfaceClass",Toast.LENGTH_LONG);
        t.show();
    }



}