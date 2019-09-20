//package com.example.sanjoth.login;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
//    String titles[]={},dates[]={},status[]={};
//    private Context context;
//
//
//    public MyRecyclerViewAdapter(Context context, String[] title, String[] date, String[] status) {
//        this.context=context;
//        this.titles=title;
//        this.dates=date;
//        this.status=status;
//    }
//
////class MyRecyclerViewAdapter {
//    public MyRecyclerViewAdapter(Context applicationContext, JSONObject jsonObject) {
//        this.context=context;
//        this.list=new JSONObject();
//        this.list=jsonObject;
//    }
//
//    @NonNull
//    @Override
//    public MyRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
//        MyRecyclerListAdapter.MyViewHolder myViewHolder=new MyRecyclerListAdapter.MyViewHolder(view);
//        return null;
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.MyViewHolder holder, int position) {
//        MyRecyclerListAdapter.MyViewHolder myViewHolder1=myViewHolder;
//        try {
//            JSONArray jsonArray=list.getJSONArray("data");
//            JSONObject jsonObject=jsonArray.getJSONObject(i);
//            myViewHolder1.setUpData(jsonObject);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//        try {
//            return list.getJSONArray("data").length();
//        } catch (JSONException e) {
//            return Integer.parseInt(null);
//        }
//    }
//}
//    }
//
