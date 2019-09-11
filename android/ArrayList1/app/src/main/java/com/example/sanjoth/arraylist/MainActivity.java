package com.example.sanjoth.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button display;
    Button delete;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button1);
        display = findViewById(R.id.button2);
        delete = findViewById(R.id.button3);
        textView=findViewById(R.id.textView);
        final ArrayList<String> Slist = new ArrayList<>();




        add.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {

                        Slist.add("Android");
                        Slist.add("Arraylist");
                        Slist.add("Array");


//                    Toast.makeText(MainActivity.this, "Plz Enter all the data", Toast.LENGTH_LONG).show();





                }
            });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0; i<Slist.size();i++) {
                    textView.append(Slist.get(i));

                }

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Slist.remove("Android");

            }
        });




        }
    }

