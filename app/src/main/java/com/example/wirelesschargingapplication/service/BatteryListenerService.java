import javax.naming.Context;

@Service
public class BatteryListenerService {//BatteryListenerService class declare
    @Autowired
    public BatteryListnerRepository batteryRepository;//batteryRepository's injection
      public BatteryListenerService battteryListenerService=new BatteryListenerService();//Obj declare
      public String getAllContext(Context context{//Fetching Context
          return batteryRepository.saveAll(context);
      }
}
