import javax.naming.Context;
@Controller
public class BatteryListenerController{
@Autowired
 public BattteryListenerService battteryListenerService;

@GetMapping("/save/{context}")
    public String getAllBatteryContext(@RequestBody Context context){

    return battteryListenerService.getAllBatteryContext(context);
    }
    @PostMapping("/findAll/{BatteryId}")//retriving BatteryId in Server
    public String setAllBatteryId(String BatteryId){
        return batteryRepository.findAllByBatteryId(BatteryId);
    }
    @GetMapping("/saveAll/{Status}")//Fetching All Status In Battery
    public String getAllByStatus(String Status){
        return batteryListnerRepository.saveAllByStatus(Status );
    }

