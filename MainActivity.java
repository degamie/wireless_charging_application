package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import static android.content.Context.WIFI_SERVICE;
import static android.os.Build.VERSION_CODES.R;

import com.example.axr_application.MainActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.ComponentActivity;

import com.example.wirelesschargingapplication.R;
//import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.textViewInfo;

import org.apache.tools.ant.Main;

public MainActivity extends AppCompatActivity{
    TextView setContentView;
    TextView batteryLvlText;
    TextView tmpVolText;
    TextView aimText;
    SeekBar seekBar;
    SharedPreferences sharedPreferences;
    ImageView moduleStatusimage;
    ImageView chargerStatusImage;
    SharedPreferences.Editor editor;

    public static void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView= android.R.layout.activity_main;
        setContentView= android.R.layout.activity_main;
        batteryLvlText= findViewById(R.id.batteryLevelText);

        tmpVolText= findViewById(R.id.tmpVolText);
        aimText= findViewById(R.id.aimText);
        seekBar= findViewById(R.id.seekBar);
        moduleStatusimage= findViewById(R.id.moduleStatusimage);
        chargerStatusImage= findViewById(R.id.chargerStatusImage);
        editor= sharedPreferences.edit();
        sharedPreferences=getSharedPreferences("ir.geraked.batterysimulator.PREFERENCES_FILE_KEY",Content.MODE_PRIVATE);
        set_goalPercent(sharedPreferences.getInt("GOAL_PERCENT_80"));
        setModuleStatusView(false);
        setChargerStatusView(false);

        BatteryReciever();
        setSeekerBarListener();
        StartService();
    }

//
}

private void setChargerStatusView(boolean b) {
}

private void setModuleStatusView(boolean b) {

}

private void setSeekerBarListener() {

}

private void StartService() {

}

public static final String TAG = MainActivity.class.getSimpleName();
    private WifiManager wifiManager;
    TextView textWifiInfo;
    Button btnInfo;

    public MainActivity(){return;}
    // public WifiBroadCastReciever wifiBroadCastReciever;

    public void getWifiInfo(View view) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ip = WifiInfo.getIpAddress();
        String macAddress = WifiInfo.getMacAddress();
        String bssId = WifiInfo.getBSSID();
        int rssid = wifiInfo.getRssi();
        String linkSpeed = WifiInfo.getLinkSpeed();
        int ssid = WifiInfo.getSSID();
        int networkId = WifiInfo.getNetworkId();
    }
    @SuppressLint("ServiceCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_main);
        wifiManager = (wifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        wifiManager.setWifiEnabled(true);
//        TextInfo textWifiInfo=(textWifiInfo) findViewById(R.id.idText);
//        Button btnInfo=(Button) findViewById(R.id.idBtm);
    }
public MainActivity extends MainBatteryManagement{}

//public ArFragment arFragment;
//    public Modelrenderer modelrenderer;
//
//    public String onCreate(){
//        arFragment=(ArFragment).getSupportFragmentManager().findFragmentById(R.id.Fragment);
//        setupModel();
//    }
//    protected String setupModel(){
//        modelrenderer.builder()
//                .setSource(this.R.raw.Plane_test_1_axr)
//                .build()
//                .thenAccept(renderable->modelrenderable=renderable)
//                .exceptionally(throwable->Toast.makeTest(MainActivity.this,"Model is Unloaded!")Toast.LENGTH_SHORT.show());
//        return null;
//    }
//    protected void setUpPlane(){
//        arFragment.setOntapListner(new BaseArFragment.onTapArPlaneListener());
//    }
//    @Override
//    public String OntapListner(HitResult hitResult,Plane plane,MotionEvent motionEvent)
//    public void OnCreateModel(AnchorNode anchorNode){
//        TransformableNode=new TransformableNode(arFragment.getTransformationSystem());
//        node.setParent(anchorNode);
//        node.setRenderable(modelrenderer);
//        node.select();
//    }