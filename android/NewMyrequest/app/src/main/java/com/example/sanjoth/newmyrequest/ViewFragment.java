package com.example.sanjoth.newmyrequest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sanjoth.newmyrequest.Global.RequestStatus;
import com.example.sanjoth.newmyrequest.Model.RequestModel;


public class ViewFragment extends Fragment {
    RequestModel requestModel;
    TextView number,description,statues;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_view, container, false);
        number=view.findViewById(R.id.textView35);
        description=view.findViewById(R.id.textView37);
        statues=view.findViewById(R.id.textView40);


        number.setText(requestModel.getRequestNumber());
        description.setText(requestModel.getDescription());
        statues.setText(requestModel.getRequestStatus().toString());

        return view;
    }

    public void setData(RequestModel requestModel){this.requestModel=requestModel;}

    }

