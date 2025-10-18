import java.util.List;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryListener;
@Repository
public interface BatteryListenerRepository extends JpaRepository<batterylistner,String>{
    @Autowired
    public BatteryListener batterylistner;
    public String saveAllByIntent(Intent intent);
    public String saveAllByStatus(String status);
    public String findAllByStatus(String status);// Finding BatteryStatus
    public String  saveAllById(String BatteryId);
    public String findAllByContext(Context context);s
    public  List<BatteryListener> saveAllByContext(String BatteryId);
    public List<BatteryListener> saveAll(String BatteryId);
    public  List<BatteryListener> saveAllById(String BatteryId);
    public String findAllById(String BatteryId);
    public String saveAllByBatteryStatus(String BatteryId);
    public String findAllByBatteryStatus(Sting Status);
}
