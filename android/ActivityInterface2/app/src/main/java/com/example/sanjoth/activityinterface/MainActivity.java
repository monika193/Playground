package com.example.sanjoth.activityinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DemoInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DemoInterfaceClass b =new DemoInterfaceClass ();
        b.interfacemethod();
        DemoInterfacemethod();

    }

    @Override
    public void DemoInterfacemethod() {
        Toast t=Toast.makeText(getApplicationContext()," This message from interface",Toast.LENGTH_LONG);
        t.show();


    }



}
