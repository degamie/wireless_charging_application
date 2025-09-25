import javax.naming.Context;

@Service
public class BatteryListenerService {//BatteryListenerService class declare
    public Logger logger;
    @Autowired
    public BatteryListnerRepository batteryRepository;//batteryRepository's injection
    public String  getAllById(String BatteryId){return batteryRepository.saveAllById(BatteryId);}
      public BatteryListenerService battteryListenerService=new BatteryListenerService();//Obj declare
      public String getAllContext(Context context{//Fetching Context
          return batteryRepository.saveAll(context);
      }
    public String setAllById(String BatteryId){
        return batteryRepository.findAllById(Id);
    }
        public String getAllByBatteryStatus(String BatteryId){

           while(BatteryId!=0){
               if(BatteryId>10){
                   batteryRepository.saveAllByBatteryId(BatteryId)+=logger.info("Battery Status is OK");
               }else  batteryRepository.saveAllByBatteryId(BatteryId)+=logger.info("Battery Status is Non OK");
           } return  batteryRepository.saveAllByBatteryId(BatteryId);}
    public String setAllByBatteryStatus(Sting Status){
          return batteryRepository.findAllByBatteryStatus(Status);
    }
}
