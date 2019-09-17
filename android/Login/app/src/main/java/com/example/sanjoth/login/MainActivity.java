package com.example.sanjoth.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
Button btn;
TextView i3;
TextView i4;
TextView forgot;
ImageView i1;
ImageView i2;
EditText  Text;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        i1=findViewById(R.id.imageView4);
        i2=findViewById(R.id.imageView2);
        i3=findViewById(R.id.textView6);
        i4=findViewById(R.id.textView7);
        forgot=findViewById(R.id.textView3);
        Text=findViewById(R.id.editText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Text.getText().toString().equals("")) {
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i4.setVisibility(View.VISIBLE);
                } else {
                    Intent intent = new Intent(getApplicationContext(), MyRequest.class);
                    startActivity(intent);
                }
            }
        });

       forgot.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),Forgotpassword.class);
               startActivity(intent);
           }
       });


    }
}
