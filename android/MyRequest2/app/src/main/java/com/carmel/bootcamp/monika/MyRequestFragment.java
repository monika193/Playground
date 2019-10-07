package com.carmel.bootcamp.monika;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.carmel.bootcamp.monika.Delegate.MyRequestDelegate;
import com.carmel.bootcamp.monika.Global.RequestStatus;
import com.carmel.bootcamp.monika.Model.RequestModel;

import java.util.ArrayList;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyRequestFragment extends Fragment {
    private ListView listView;
    private MyRequestDelegate myrequestDelegate;
    TextView listpopup;
    private View view;
//    private LayoutInflater layoutInflater;
//    private LinearLayout linearLayout;
//    private PopupWindow popupWindow;
    ListPopupWindow listPopupWindow;
    private ImageView filter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_request, container, false);

        listView = view.findViewById(R.id.listview);
        filter = view.findViewById(R.id.filterimage);
//        listPopupWindow=new  android.widget.ListPopupWindow(view.getContext());
//        linearLayout=view.findViewById(R.id.layout);


//        filter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                layoutInflater =(LayoutInflater)view.getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
//                ViewGroup container= (ViewGroup) layoutInflater.inflate(R.layout.popupmenu,null);
//                popupWindow=new PopupWindow(container ,40,40,true);
//                popupWindow.showAtLocation(linearLayout,Gravity.NO_GRAVITY,500,500);
//                container.setOnTouchListener(new View.OnTouchListener() {
//                    @Override
//                    public boolean onTouch(View v, MotionEvent motionEvent) {
//                        popupWindow.dismiss();
//                        return true;
//                    }
//                });
//
//            }
//        });
        listPopupWindow = new android.widget.ListPopupWindow(view.getContext());
        listpopup =  view.findViewById(R.id.popuptext);
        final String[]content_list={"CLEAR","APPROVED","DRAFT","AWAITING","REJECTED"};
        final ArrayList<RequestModel> Requestlist = new ArrayList<>();

        RequestModel requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.Approved);
        requestModel.setDescription("07-jul-2019");
        Requestlist.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-057");
        requestModel.setRequestStatus(RequestStatus.Draft);
        requestModel.setDescription("08-jul-2019");
        Requestlist.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-058");
        requestModel.setRequestStatus(RequestStatus.Rejected);
        requestModel.setDescription("09-jul-2019");
        Requestlist.add(requestModel);

        requestModel = new RequestModel();

        requestModel.setRequestNumber("PUR-2019-059");
        requestModel.setRequestStatus(RequestStatus.Awaiting);
        requestModel.setDescription("10-jul-2019");
        Requestlist.add(requestModel);

        ListAdapter listAdapter = new MyListAdapter(view.getContext(),Requestlist);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RequestModel request = Requestlist.get(position);
                if (myrequestDelegate != null) {
                    myrequestDelegate.onclickRequestItem(request);
                }

            }

        });
        listPopupWindow = new ListPopupWindow(view.getContext());
        listPopupWindow.setAdapter(new ArrayAdapter<>(view.getContext(), R.layout.popupmenu,content_list));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });
        return view;


    }
    public void setMyrequestDelegate(MyRequestDelegate myrequestDelegate){
        this.myrequestDelegate=myrequestDelegate;
    }


}
