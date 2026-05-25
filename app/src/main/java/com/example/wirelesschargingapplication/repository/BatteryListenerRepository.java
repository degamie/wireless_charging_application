//WID(25/05/2026)(Sarthak Mittal)(DegamieSign)#11
import java.util.List;

import android.content.Context;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryListener;
@Repository
public interface BatteryListenerRepository extends JpaRepository<batterylistner,String>{
    @Autowired
    public BatteryListener batterylistner;
    public List<BatteryListener> findByStatus(String status);
    public void updatebyContext(Context context);

    public void findAllByContext(Context context);
    public String saveAllByStatus(String Status);
    public  List<BatteryListener> saveAllByContext(String BatteryId);

    public List<BatteryListener> saveAll(String BatteryId);
    public  List<BatteryListener> saveAllById(String BatteryId);

    public List<BatteryListener>findAllByBatteryId(String BatteryId);
}
