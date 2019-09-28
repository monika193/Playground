package com.example.sanjoth.newmyrequest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanjoth.newmyrequest.Model.RequestModel;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter {
    TextView title;
    public Context context;

    ArrayList<RequestModel> request;
    public MyListAdapter(Context applicationContext, ArrayList<RequestModel> requestList) {
        this.context=context;
        this.request=requestList;
    }

    @Override
    public int getCount() {
        return  request.size();
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
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView notificationimage;

        View view1 =LayoutInflater.from(context).inflate(R.layout.listview,null);
        RequestModel requestModel= this.request.get(i);
        TextView title=(TextView) view1.findViewById(R.id.textview1);
        title.setText(String.valueOf(requestModel.getRequestNumber()));
        TextView name=(TextView) view1.findViewById(R.id.textView3);
        name.setText(String.valueOf(requestModel.getRequestStatus()));
        TextView date=(TextView)view1.findViewById(R.id.textView4);
        date.setText(String.valueOf(requestModel.getDescription()));
        notificationimage=view1.findViewById(R.id.notification);
        notificationimage.setImageResource(R.drawable.bell);

        return view1;
    }
}
