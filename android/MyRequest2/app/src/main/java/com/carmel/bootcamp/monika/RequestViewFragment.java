package com.carmel.bootcamp.monika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.carmel.bootcamp.monika.Model.RequestModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class RequestViewFragment extends Fragment {
    RequestModel requestModel;
    TextView number,date,statues;
    private View view;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_request_view, container, false);

        view= inflater.inflate(R.layout.fragment_request_view, container, false);

        number=view.findViewById(R.id.numberview);
        date=view.findViewById(R.id.dateview);
        statues=view.findViewById(R.id.statusview);

        if (requestModel != null) {
            number.setText(requestModel.getRequestNumber());
            date.setText(requestModel.getDescription());
            statues.setText(requestModel.getRequestStatus().toString());
        }

        return view;
    }
    public void setDatafetching(RequestModel requestModel){this.requestModel=requestModel;}

}
