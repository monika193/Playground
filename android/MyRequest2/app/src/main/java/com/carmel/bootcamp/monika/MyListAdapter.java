package com.carmel.bootcamp.monika;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.carmel.bootcamp.monika.Model.RequestModel;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter {

    public Context context;
    ArrayList<RequestModel> request;
    public MyListAdapter(Context context, ArrayList<RequestModel> requestList) {

        this.context=context;
        this.request=requestList;
    }

    @Override
    public int getCount() {
        return request.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
            View view1 =LayoutInflater.from(context).inflate(R.layout.listviewdesign,viewGroup,false);

            TextView number,statusview,date;
            ImageView notificationimage;

            RequestModel requestModel= this.request.get(position);

            number= view1.findViewById(R.id.number);
            number.setText(String.valueOf(requestModel.getRequestNumber()));

            date=view1.findViewById(R.id.date);
            date.setText(String.valueOf(requestModel.getRequestStatus()));

            statusview=view1.findViewById(R.id.status);
            statusview.setText(String.valueOf(requestModel.getDescription()));

            notificationimage=view1.findViewById(R.id.bell_icon);
            notificationimage.setImageResource(R.drawable.notificationimage);

            return view1;
    }
}
