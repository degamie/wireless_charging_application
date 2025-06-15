package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model.Battery;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class BatteryAPi {
    @GET
    Call<List<Battery>>();
}
