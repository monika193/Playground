package com.example.sanjoth.library;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity{
    TextView name;
    TextView registerno;
    TextView fathername;
    TextView branch;
    TextView address;
    TextView title;
    TextView author;
    TextView price;
    TextView StudentList;
    TextView BookList;
    Button   load;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name=findViewById(R.id.textView1);
        registerno=findViewById(R.id.textView2);
        fathername=findViewById(R.id.textView3);
        branch=findViewById(R.id.textView4);
        address=findViewById(R.id.textView5);
        title=findViewById(R.id.textView6);
        author=findViewById(R.id.textView7);
        price=findViewById(R.id.textView8);
        load=findViewById(R.id.button);
        StudentList=findViewById(R.id.textView9);
        BookList=(findViewById(R.id.textView10));


        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Book object=new Book("science","Rohith","150","BookList");
                Student b=new Student("Mr. Abhishek","123","Mr. Sulekh", "E&C","#321, South Street, No-3, Ontario","StudentList");
                name.setText( b.name);
                registerno.setText(b. registerno);
                fathername.setText( b. fathername);
                branch.setText(b. branch);
                address.setText(b. address);
                StudentList.setText(b.StudentList);
                title.setText(object. title);
                author.setText(object. author);
                price.setText(object. price);
                BookList.setText(object.BookList);

            }
        });


    }

}











