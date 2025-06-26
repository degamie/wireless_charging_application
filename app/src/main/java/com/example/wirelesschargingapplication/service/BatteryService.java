import javax.naming.Context;

@Service
public class BatteryService{
    @Autowired
    public BatteryRepository batteryRepository;
    public String getAllByWifiId(long  WifiId){
        return batteryRepository.saveAllByWifiId(WifiId);
    }


}