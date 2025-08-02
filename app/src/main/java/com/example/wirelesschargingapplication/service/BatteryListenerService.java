import javax.naming.Context;

@Service
public class BatteryListenerService {//BatteryListenerService class declare
    @Autowired
    public BatteryListnerRepository batteryRepository;//batteryRepository's injection
      public BatteryListenerService battteryListenerService=new BatteryListenerService();//Obj declare
      public String getAllContext(Context context{//Fetching Context
          return batteryRepository.saveAll(context);
      }
    public String setAllBatteryId(String BatteryId){
        return batteryRepository.findAllByBatteryId(BatteryId);
    }
    public String getAllByStatus(String Status){
          return batteryListnerRepository.saveAllByStatus(Status );
    }
}
