package com.example.sanjoth.activityinterface;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class DemoInterfaceClass extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        interfacemethod(getApplicationContext());

    }




     DemoInterfaceClass(){

    }
    public void  interfacemethod(Context applicationContext){

        Log.d("interfacemethod", "interfacemethod: This message from DemoInterfaceClass ");
        Toast t=Toast.makeText(applicationContext," This message from DemoInterfaceClass",Toast.LENGTH_LONG);
        t.show();
    }



}