package com.example.sanjoth.library;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Student{
    String name;
    int registerno;
    String fathername;
    String branch;
    String address;

    Student(String name, int registerno, String fathername, String branch, String address) {
        this.name = name;
        this.registerno = registerno;
        this.fathername = fathername;
        this.branch = branch;
        this.address = address;
    }
}

