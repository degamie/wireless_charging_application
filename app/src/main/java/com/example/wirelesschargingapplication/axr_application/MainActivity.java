package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import static android.content.Context.BATTERY_SERVICE;
import static android.content.Context.WIFI_SERVICE;
import static android.os.Build.VERSION_CODES.R;

import static androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getResources;
import static androidx.core.content.res.TypedArrayUtils.getText;

import com.example.axr_application.MainActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentFilter;
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
import android.widget.Toast;

import androidx.activity.ComponentActivity;

import com.example.wirelesschargingapplication.R;
//import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.textViewInfo;

import org.apache.tools.ant.Main;
import org.w3c.dom.Text;

public MainActivity extends AppCompatActivity{
    //Variables decalre
     public int goalPercent;
    Boolean isCharging=null;
    public Text goaltxt =null;
    public Integer goalPercent =0;

    public Integer batteryPercent=0;
    //Object Declare
    TextView setContentView;
    TextView batteryLvlText;
    TextView tmpVolText;
    TextView aimText;
    SeekBar seekBar;
    SharedPreferences sharedPreferences;
    ImageView moduleStatusimage;
    ImageView chargerStatusImage;
    SharedPreferences.Editor editor;
    BatteryReciever batteryReciever;

    public void set_goalPercent(int x){
        if(x>=100)goalPercent=100;
        else if(x<=0)goalPercent=0;
        else goalPercent=x;
        goaltxt=x;
        goaltxt.setTextContent(getResources().getString(R.String.goal)+" "+goalPercent);
        seekBar.setProgress(goalPercent);
        startGoalPercentTimer();
    }
    private void StartService() {
        Intent intent =new Intent(this,ForegroundService.class);
        intent.putExtra("input",getText(R.string.app_running_details));
        Context.startForegroundService(this,intent);

    }
//OnCreate Method Declare
    public void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView= android.R.layout.activity_main;//Setting the Content View
        batteryLvlText= findViewById(R.id.batteryLevelText);

        tmpVolText= findViewById(R.id.tmpVolText);//Text Volume declare
        aimText= findViewById(R.id.aimText);//AImimg the TExt
        seekBar= findViewById(R.id.seekBar);//SeekBar Declare
        moduleStatusimage= findViewById(R.id.moduleStatusimage);//ModuleStatus Image Declare
        chargerStatusImage= findViewById(R.id.chargerStatusImage);//ChargerStatus Image Declare
        editor= sharedPreferences.edit();//Editor Method declare
        sharedPreferences=getSharedPreferences("ir.geraked.batterysimulator.PREFERENCES_FILE_KEY",Content.MODE_PRIVATE);//SharedPreferences Method Declare
        set_goalPercent=(sharedPreferences.getInt("GOAL_PERCENT_80"));//Setting the GoalPercent Declare
        setModuleStatusView(false);//Initializing the setModuleStatusView
        setChargerStatusView(false);//Initializing the setChargerStatusView

        BatteryReciever();//Calling the BatteryReciever Mehtod
        setSeekerBarListener();//Seeking the Method 's Implmentation g
        StartService();//Startign the StartService Method
    }
    public void message(String text){// BatteryMessage Funct decalre
        Toast.makeText(getApplicationContext,text);//Printing the Text Declare
        Toast.LENGTH_SHORT.show();//Printing the Short Text

    }
    public void sendOn(View v){usbReciever.sendOnSignal();  }////Sending Input Message


    public void SendOff(View v){ usbReciever.sendOffSignal();}////Sending Input Message


    public void OnBatteryReciever(){//BatteryReciever Method Declare
        setBatteryLevel();//Calling the SetBattery Level

    SetChargerStatusView(BatteryReciever.isCharging());//Calling the Charging's StatusView Method

     TempVolText.setText(BatteryReciever.class.temperature+Character.toString(char),>6)+"C"+batteryReciever.voltage+"V";//battery's Level Text Decalre
    }
    public void setBatteryLevel(){//Setting the Battery Level
        batteryPercent=batteryReciever.batteryPercent;//BatteryPercentage Method Declare
        isCharging=batteryReciever.isCharging;//Battery' Charging Limit Declare
        BatteryLevelTxt.setText(batteryPercent+" ");//Setting the Battery Level's text
        else if(batteryPercent>=goalPercent && chargerStatusImage){       // checking the Battery  with its GoalPercent
            usbReciever.sendOnSignal();////Sending Input Message
        }
        if(batteryPercent<=goalPercent && chargerStatusImage){
            usbReciever.sendOffSignal();//Sending usbReciever's Method OffSignal
        }
    }
}
//Method's To Be Implemented
private void setBatteryLevel() {}

private void setChargerStatusView(boolean b) {}

private void setModuleStatusView(boolean b) {}

private void setSeekerBarListener() {}


public void initiateBatteryService(){
    BatteryReciever batteryReciever=new BatteryReciever();
    @Override
            public void onRecieverDo(){
                onRecieverDo();
            }
            registerReciever(BatteryReciever,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
}
    //BATTERY_SERVICE

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