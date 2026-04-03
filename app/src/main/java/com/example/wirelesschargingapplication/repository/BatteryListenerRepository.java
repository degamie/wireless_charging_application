//WID(3/04/2026)(Sarthak Mittal)#1.1.1.1.1.1
package com.example.wirelesschargingapplication.repository;//WID(28/2/2026)Sarthak Mittal(Degamiesign)#1.1.1.1.1.1.1.1.1.1
import java.util.List;

import android.content.Context;
import android.content.Intent;
import com.android.aapt.Resources;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryListener;

import jdk.internal.loader.Resource;

@Repository
public interface BatteryListenerRepository extends JpaRepository<batterylistner,String>{
    public List<BatteryListener> saveByBatterylistener(BatteryListener batteryListener);
    public List<BatteryListener> findByIntent(Intent intent);
    public List<BatteryListener> existsByBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository);//Checking batteryListenerRepository's Existence in App
    public List<BatteryListener> updateByBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository);//updating batteryListenerrepository in App
    public List<BatteryListener>saveByBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository);//Reteriving BatteryListernerRepository in App
    public List<BatteryListener> findByBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository);
    public BatteryListenerRepository batteryListenerRepository = null;
    public void existsByIntent(Intent intent);
    public List<BatteryListener> getBatteryStatus(String BatteryStatus);
    public List<BatteryListener> updateByBatteryListener(BatteryListener batteryListener);
    public List<BatteryListenerRepository> existsByBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository);
    public void setBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository){this.batteryListenerRepository=batteryListenerRepository;}
    public BatteryListenerRepository getBatteryListenerRepository(BatteryListenerRepository batteryListenerRepository){return batteryListenerRepository;}//Fetching BatteryListener in App
    @Autowired
    public BatteryListener batterylistner;
    public void setBatterylistner(BatteryListener batterylistner){this.batterylistener=batterylistner;}//binding batteryListener in App
    public BatteryListener getBatterylistner(BatteryListener batterylistner){return batterylistner;}//Fetching BatteryListener in App
    public void updateByBatteryListener( BatteryListener batterylistner){getBatterylistner(batterylistner)+setBatterylistner(batterylistner)+1;}
    public void existsByBatteryListener(BatteryListenerRepository batteryListenerRepository){
        if(batteryListenerRepository.length>0)getBatterylistner( batteryListenerRepository);
        else getBatterylistner(0);
    }
    public String saveAllByIntent(Intent intent);
    public String findAllByIntent(Intent intent);
    public String updateByIntent(Intent intent);//updating Intent In App
    public String existsByIntent(Intent intent);//Checking Intent In Server
    public String saveAllByStatus(String status);
    public String findAllByStatus(String status);// Finding BatteryStatus
    public Long  saveAllById(String BatteryId);
    public String findAllByContext(Context context);
    public  List<BatteryListener> saveAllByContext(Context context);
    public List<BatteryListener> updateByContext(Context context);//Updating Context In App
    public List<BatteryListener> existsByContext(Context context);//Checking Context's existence in App
    public List<BatteryListener> saveAll(String BatteryId);
    public  List<BatteryListener> saveAllById(String BatteryId);
    public Long findAllById(Long BatteryId);
    public void updateById(Long BatteryId);
    public Long existsById(Long BatteryId);
    public String saveAllByBatteryStatus(String BatteryId);
    public String findAllByBatteryStatus(String Status);
    public String saveAllByIntentAction(IntentAction intentAction);
    public void findAllByIntentAction(IntentAction intentAction);
    public String updateAllBYIntentAction(IntentAction intentAction);
    public String existsAllByIntentAction(IntentAction intentAction);
    public String updateBybatteryListener(String Status);//Updating BatteryStatus in App
    public void existsByBatteryListener(String Status);//Checking BatteryStatus in Server
    public Long updateById(Long BatteryId);
    public void existsById(Long BatteryId);
    public void updateByStatus(Resources.String Status);
    public void existsByStatus(Resource.String Status);
}
