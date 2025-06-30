package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import java.io.File;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;
//public class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting Broadpublic class BootReciever extends BroadCastReciever{//BootReciever  Declare Inheriting BroadCastReciever  ClassCastReciever  Class

@Getter
@Setter
@AllParamsContructor
@NoParamsContructor
public class BootReciever extends BroadCastReciever  {
    @Id
    @GeneraatedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unique=true,nullable=false);
    public int LOG_SIZE=0;//Log Size Declare
    @Column(unique=falsee,nullable=true);
    public BroadCastReciever broadCastReciever;
    @Column(unique=falsee,nullable=true);
    public BootReciever bootReciever;//Obj Declare
    @Column(unique=falsee,nullable=true)
    public String TAG=null;//Tag Declare
    @Column(unique=falsee,nullable=true)

    public static final File TOMBSTONE_DIR=new File("/data/tombStones");//TOMBSTONE_DIR declare;
    @SuppressLint("NewApi")
    public void OnCreate(){//Func declare
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectUnsafeIntentLaunch().build());//Setting Bootstrapping's Security
    }
    public Integer OnInit(){//Method Declare
        if(LOG_SIZE==0)return 0;
        while(LOG_SIZE!=0){
            else if(LOG_SIZE>0){
                LOG_SIZE++;
            }
            else LOG_SIZE=TAG.length(LOG_SIZE);
        }return LOG_SIZE;
    }
}

//    public String getBootReciever(BootReciever bootReciever){//Fethcing BootReciever
//        return  bootReciever;
//    }
////    public static final String TAG="Boot Reciever";//Tag Declare

//    public String getFileSize(int LOG_SIZE,String TAG){
//        return LOG_SIZE+TAG;
//    }
//    public void setFilesize(TOMBSTONE_DIR,LOG_SIZE,TAG){//File Size Set Declare
//        this.TOMBSTONE_DIR=TOMBSTONE_DIR;//Binding Up the Var
//        this.LOG_SIZE=LOG_SIZE;
//        this.TAG=TAG;
//    }
//    public BootReciever(){//Default Constructor Declare
//        return;
//    }


//    public BootReciever(String TAG,int LOG_SIZE,Boolean B){//Parameterized Constructor declare
//        this.bootReciever=bootReciever;
//        this.TAG=TAG;
//        this.LOG_SIZE==65336;
//        B=LOG_SIZE;
//    }
