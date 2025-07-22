import javax.naming.Context;

@Service
public class BatteryService{
    @Autowired
    public BatteryRepository batteryRepository;
    public String getAllByWifiId(long  WifiId){
        return batteryRepository.saveAllByWifiId(WifiId);
    }

    public String setAllByWifiyId(long  WifiId){
        return batteryRepository.findAllByWifiId(WifiId);
    }
    public String getAllByBatteryPercentage(String BatteryPercentage){
        return batteryRepository.saveAllByBatteryPercentage(BatteryPercentage);
    }
}