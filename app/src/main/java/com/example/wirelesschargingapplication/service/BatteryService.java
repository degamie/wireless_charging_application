@Service
public class BatteryService{
    @Autowired
    public BatteryRepository batteryRepository;
    public String getAllBatteryById(String BatteryId){
        return batteryRepository.saveAllBatteryById(BatteryId);
    }
}