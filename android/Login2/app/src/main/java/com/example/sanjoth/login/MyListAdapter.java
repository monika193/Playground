package com.example.sanjoth.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanjoth.login.Model.RequestModel;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {
     TextView title;
//     ImageView imageView;
//    TextView name;
//    TextView date;

    public Context context;
    //    LayoutInflater layoutInflater;
//    ArrayList<String> Slist;
//    ArrayList<String> Slist1;
//    ArrayList<String> Slist2;

//    public MyListAdapter( Context context , ArrayList<String> ) {
//        this.Slist=slist;
//        this.Slist1=slist1;
//        this.Slist2=slist2;
//        this.context= context;
//     layoutInflater=(LayoutInflater.from(Context));

//    }
    ArrayList<RequestModel> request;

    public MyListAdapter(Context context,ArrayList<RequestModel> requestList) {
        this.context=context;
        this.request=requestList;
    }


    @Override
    public int getCount() {
        return request.size();

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView notificationimage;

        View view1 =LayoutInflater.from(context).inflate(R.layout.listview,null);
        RequestModel requestModel= this.request.get(i);
        TextView title=(TextView) view1.findViewById(R.id.textview1);
        title.setText(String.valueOf(requestModel.getRequestNumber()));
        TextView name=(TextView) view1.findViewById(R.id.textView3);
        name.setText(String.valueOf(requestModel.getRequestStatus()));
        TextView date=(TextView)view1.findViewById(R.id.textView4);
        date.setText(String.valueOf(requestModel.getDescription()));
//        ImageView imageView=(ImageView)view1.findViewById(R.id.image);
        notificationimage=view1.findViewById(R.id.notification);
        notificationimage.setImageResource(R.drawable.bell);





        return view1;



    }
}


