package com.example.sanjoth.login;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class Forgotpassword extends AppCompatActivity {
    Button     btn;
    ImageView  i1;
    ImageView  i2;
    TextView   i3;
    TextView   i4;
    AlertDialog.Builder alertdialog;
    EditText  editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        btn=findViewById(R.id.button2);
        i1=findViewById(R.id.imageView3);
        i2=findViewById(R.id.imageView5);
        i3=findViewById(R.id.textView11);
        i4=findViewById(R.id.textView12);
        editText=findViewById(R.id.editText3);
        alertdialog=new AlertDialog.Builder(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             if (editText.getText().toString().equals("")){
                 i1.setVisibility(View.VISIBLE);
                 i1.setVisibility(VISIBLE);
                 i2.setVisibility(VISIBLE);
                 i3.setVisibility(VISIBLE);
                 i4.setVisibility(VISIBLE);
             }else{
                 final View alertView=getLayoutInflater().inflate(R.layout.alert_dialog,null);
                 alertdialog.setView(alertView);
                 final AlertDialog alertDialog=alertdialog.create();
                 alertDialog.show();


             }

            }
        });

    }
}
