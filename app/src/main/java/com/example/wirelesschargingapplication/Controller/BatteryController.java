@Controller
public class BatteryController{//BatteryController Class Declare
    public BatteryController batteryController;
    @Autowired
    public BatteryService batteryService;//Injecting batteryService implement
    @GetMapping("/save/{batteryid}")//Getting Batterid's Data
    public String getAllBatteryById(String BatteryId){//getAllBatteryById Method
        return batteryService.getAllBatteryById(BatteryId);//fetching BatteryId
    }
    @GetMapping("/save/{batteryName}")//Getting BatterName's Data
    public String getAllByBatteryName(String BatteryName){
        return batteryService.getAllByBatteryName(BatteryName);

    }
}
//    @Override