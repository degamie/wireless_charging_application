@Controller
public class BatteryController{//BatteryController Class Declare
    @Autowired
    public BatteryService batteryService;//Injecting batteryService implement
    @GetMapping("/save/{batteryid}")//Getting Batterid's Data
    public String getAllBatteryById(String BatteryId){//getAllBatteryById Method
        return batteryService.getAllBatteryById(BatteryId);//fetching BatteryId
    }

}
//    @Override