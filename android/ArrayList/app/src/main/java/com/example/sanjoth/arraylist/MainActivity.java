package com.example.sanjoth.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button display;
    Button delete;
    TextView textView;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.button1);
        display = findViewById(R.id.button2);
        delete = findViewById(R.id.button3);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);

        final ArrayList<String> Slist = new ArrayList<>();




        add.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                 String Value=editText.getText().toString();

                    Slist.add(Value);
//                    Slist.add("Arraylist");
//                    Slist.add("Array");



//                    Toast.makeText(MainActivity.this, "Plz Enter all the data", Toast.LENGTH_LONG).show();





                }
            });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(null);
                for (int i=0; i<Slist.size();i++) {
                    textView.append(Slist.get(i)+"\n");

                }

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Value=editText2.getText().toString();
                Slist.remove(Value);

            }
        });




        }
    }

