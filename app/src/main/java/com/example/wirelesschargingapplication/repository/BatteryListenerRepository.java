import java.util.List;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryListener;
@Repository
public interface BatteryListenerRepository extends JpaRepository<batterylistner,String>{
    @Autowired
    public BatteryListener batterylistner;
    public String saveAllByStatus(String Status);
    public  List<BatteryListener> saveAllByContext(String BatteryId);
    public List<BatteryListener> saveAll(String BatteryId);
    public  List<BatteryListener> saveAllById(String BatteryId);

    public List<BatteryListener>findAllByBatteryId(String BatteryId);
}