@Controller
public class BatteryController{//BatteryController Class Declare
    public BatteryController batteryController;
    @Autowired
    public BatteryService batteryService;//Injecting batteryService implement
    @GetMapping("/save/{WifiId}")
    public String getAllByWifiId(long  WifiId){//FetchingWifiId
        return batteryService.getAllByWifiId(WifiId);
    }
    @GetMapping("/save/{batteryid}")//Getting Batterid's Data
    public String getAllBatteryById(String BatteryId){//getAllBatteryById Method
        return batteryService.getAllBatteryById(BatteryId);//fetching BatteryId
    }
    @GetMapping("/save/{batteryName}")//Getting BatterName's Data
    public String getAllByBatteryName(String BatteryName){
        return batteryService.getAllByBatteryName(BatteryName);
    }
    @PostMapping("/find/{WifiId}")//Posting WifiId in Server
    public String setAllByWifiyId(long  WifiId){
        return batteryService.setAllByWifiyId(WifiId);
    }
    @GetMapping("/save/{batteryPercentage}")//Fetching BatteryPercentage
    public String getAllByBatteryPercentage(String BatteryPercentage){
        return batteryService.getAllByBatteryPercentage(BatteryPercentage);
    }
}
//    @Override