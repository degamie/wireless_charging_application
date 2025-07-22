package  com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.Repository.BatteryRepository;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model.Battery;
@Repository
public interface BatteryRepository extends JpaRepository<Battery,String>{
    public String findAllByWifiyId(long  WifiId);
    public String saveAllBWifiyId(long  WifiId);
    public String saveAllByBatteryId(String BatteryId);
    public String saveAllByBatteryName(String BatteryName);
    public String saveAllByBatteryPercentage(String BatteryPercentage);


}