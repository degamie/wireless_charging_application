package com.example.wirelesschargingapplication.Controller;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;
import com.example.wirelesschargingapplication.service.BootRecieverService;

import java.io.File;
//public class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting Broadpublic class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting BroadCastReciever  ClassCastReciever  Class

@Controller
public class BootRecieverController {
    @Autowired
    public BootRecieverService bootRecieverService;
    @GetMapping("/save/{LOG_SIZE}")

    public String getAllByLogSize(Integer LOG_SIZE){
        return bootRecieverService.getAllByLogSize(LOG_SIZE);
    }
}