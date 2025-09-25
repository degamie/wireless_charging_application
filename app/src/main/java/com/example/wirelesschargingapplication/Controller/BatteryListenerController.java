import javax.naming.Context;
@Controller
public class BatteryListenerController {
    @Autowired
    public BattteryListenerService battteryListenerService;

    @GetMapping("/save/{context}")
    public String getAllBatteryContext(@RequestBody Context context) {

        return battteryListenerService.getAllBatteryContext(context);
    }
    @PostMapping("/find/{BatteryId}")
    public String setAllById(String BatteryId) {
        return batteryRepository.findAllById(Id);
    }
    @GetMapping("/saveAll/{BatteryId}")//Fetching BatteryId in Server
    public String  getAllById(String BatteryId){return batteryRepository.saveAllById(BatteryId);}
    @GetMapping("/saveAll/{BatteryStatus}")//Fetching BatteryStatus in Server
        public String getAllByBatteryIdStatus(String BatteryId){
            while(BatteryId!=0){
                if(BatteryId>10){
                    batteryRepository.saveAllByBatteryId(BatteryId)+=logger.info("Battery Status is OK");
                }else  batteryRepository.saveAllByBatteryId(BatteryId)+=logger.info("Battery Status is Non OK");
            } return  batteryRepository.saveAllByBatteryId(BatteryId);}
    public String setAllByBatteryStatus(Sting Status){
        return batteryRepository.findAllByBatteryStatus(Status);
    }
}
}
