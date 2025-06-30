package com.example.wirelesschargingapplication.service;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;
import com.example.wirelesschargingapplication.repository.BootRecieverRepository;

import java.io.File;
//public class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting Broadpublic class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting BroadCastReciever  ClassCastReciever  Class

@Service
public class BootRecieverService {
 @Autowired
public BootRecieverRepository bootRecieverRepository;
 public String getAllByLogSize(Integer LogSize){
 return bootRecieverRepository.saveAllByLogSize(LogSize);}
}