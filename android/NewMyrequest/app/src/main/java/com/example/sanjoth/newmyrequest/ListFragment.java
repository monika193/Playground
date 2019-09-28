package com.example.sanjoth.newmyrequest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.sanjoth.newmyrequest.Global.RequestStatus;
import com.example.sanjoth.newmyrequest.Model.RequestModel;
import com.example.sanjoth.newmyrequest.delegates.DelegateForm;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    ListView listView;
    ImageView filter;
    Button button;
    ImageView imageview;
    private DelegateForm delegateForm;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_list, container, false);

        button =view. findViewById(R.id.button3);


        final ListView listView=(ListView) view.findViewById(R.id.listview);


//
//       ArrayList<String> Slist = new ArrayList<>(5);
//        ArrayList<String> Slist1 = new ArrayList<>(5);
//        ArrayList<String> Slist2 = new ArrayList<>(5);
        final ArrayList<RequestModel> requestList=new ArrayList<>();

//        ArrayList<RecyclerView> recyclerViews=new ArrayList<>();
//        final ArrayList<String> requisition = new ArrayList<>();


        RequestModel requestModel= new RequestModel();

        requestModel.setRequestNumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.Approved);
        requestModel.setDescription("07-jul-2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-057");
        requestModel.setRequestStatus(RequestStatus.Draft);
        requestModel.setDescription("08-jul-2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-058");
        requestModel.setRequestStatus(RequestStatus.Rejected);
        requestModel.setDescription("09-jul-2019");
        requestList.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-059");
        requestModel.setRequestStatus(RequestStatus.Awaiting);
        requestModel.setDescription("10-jul-2019");
        requestList.add(requestModel);


        MyListAdapter listAdapter=new MyListAdapter(view.getContext(),requestList);
        listView.setAdapter((ListAdapter) listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                RequestModel request =  requestList.get(i);
                if (delegateForm !=null){
                    delegateForm.onclickRequestItem(request);
                }


//                Intent intent = new Intent(getApplicationContext(), RequestView33.class);
//                Bundle requestDataBundel =new Bundle();
//                requestDataBundel.putString("RequestNumber",request.getRequestNumber());
//                requestDataBundel.putString("RequestDescription",request.getDescription());
//                requestDataBundel.putString("RequestStatus",request.getRequestStatus().toString());

//                intent.putExtra("request",requestDataBundel);
//                startActivity(intent);




            }
        });
        return view;


    }
    public void setDelegateForm(DelegateForm delegateForm){
        this.delegateForm=delegateForm;
    }


    }


