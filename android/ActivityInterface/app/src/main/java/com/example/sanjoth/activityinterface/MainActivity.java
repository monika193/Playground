package com.example.sanjoth.activityinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DemoInterface {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DemoInterfaceClass b =new DemoInterfaceClass();
//        b.interfacemethod(getApplicationContext());
        btn=findViewById(R.id.Button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DemoInterfaceClass b =new DemoInterfaceClass();
                b.interfacemethod(getApplicationContext());

            }
        });

//        DemoInterfacemethod();

    }

    @Override
    public void DemoInterfacemethod() {
        Toast t=Toast.makeText(getApplicationContext()," This message from interface",Toast.LENGTH_LONG);
        t.show();


    }



}
