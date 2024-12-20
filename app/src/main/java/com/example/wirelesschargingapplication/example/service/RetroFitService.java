package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.service;

import retrofit2.Retrofit;
import retrofit2.Converter.gson.GsonConverterFactory;

//import retrofit2.G;

public class RetroFitService {
    public Gson gson=new Gson();
    public RetroFitService retroFitService;

    public RetroFitService getRetroFitService() {
        return retroFitService;
    }

    public intializeRetrofitService(){

        retroFitService=new Retrofit.Builder()
                .build()
                .baseUrl("http://192.168.29.235:8080")
                .addConverterFactory(GsonConverterFactory.create(gson()))
    }
}