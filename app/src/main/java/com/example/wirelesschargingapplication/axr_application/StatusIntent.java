package com.example.wirelesschargingapplication;

import android.content.Intent;

public class StatusIntent  extends Intent {
    public StatusIntent statusIntent;
    public StatusIntent(StatusIntent statusintent){
        this.statusIntent=statusintent;
    }
    public String getStatusIntent(StatusIntent statusintent){
        return statusintent;
    }

}
