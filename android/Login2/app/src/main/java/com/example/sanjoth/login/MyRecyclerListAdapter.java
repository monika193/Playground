package com.example.sanjoth.login;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

class MyRecyclerListAdapter extends RecyclerView.Adapter<MyRecyclerListAdapter.MyViewHolder> {
    String titles[],dates[],status[];
    private Context context;

    public MyRecyclerListAdapter(Context applicationContext, String[] title, String[] date, String[] status) {
        this.context=applicationContext;
        this.titles=title;
        this.dates=date;
        this.status=status;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.listview,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyRecyclerListAdapter.MyViewHolder myViewHolder = (MyRecyclerListAdapter.MyViewHolder) holder;
        myViewHolder.setUpData(String.valueOf(titles[position]),String.valueOf(dates[position]),String.valueOf(status[position]));
    }



    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder{
        public TextView title,date,statusText;
       public ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.textview1);
            date=itemView.findViewById(R.id.textView3);
            statusText=itemView.findViewById(R.id.textView4);
           imageView=itemView.findViewById(R.id.image);
        }

        public void setUpData(String titles, String dates, String status) {
            title.setText(titles);
            date.setText(dates);
            statusText.setText(status);
           imageView.setImageResource(R.drawable.bell);
        }

        public void setUpData(JSONObject jsonObject) {
        }
    }
}
