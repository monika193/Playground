package com.example.sanjoth.login.Model;



import com.example.sanjoth.login.Global.RequestStatus;

import java.io.Serializable;

public class   RequestModel {;
    private String requestNumber;
    RequestStatus requestStatus;
    private String Description;

    public static RequestModel get(int i) {

        return null;
    }


    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }



}



