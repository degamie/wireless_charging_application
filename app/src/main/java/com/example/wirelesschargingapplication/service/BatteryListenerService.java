import javax.naming.Context;

@Service
public class BatteryListenerService {//BatteryListenerService class declare
    @Autowired
    public BatteryListnerRepository batteryRepository;//batteryRepository's injection
    public String  getAllById(String BatteryId){return batteryRepository.saveAllById(BatteryId);
      public BatteryListenerService battteryListenerService=new BatteryListenerService();//Obj declare
      public String getAllContext(Context context{//Fetching Context
          return batteryRepository.saveAll(context);
      }
    public String setAllById(String BatteryId){
        return batteryRepository.findAllById(Id);
    }
}
