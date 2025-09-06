import javax.naming.Context;
@Controller
public class BatteryListenerController {
    @Autowired
    public BattteryListenerService battteryListenerService;

    @GetMapping("/save/{context}")
    public String getAllBatteryContext(@RequestBody Context context) {

        return battteryListenerService.getAllBatteryContext(context);
    }
    @GetMapping("/save/{BatteryId}")
    public String setAllById(String BatteryId) {
        return batteryRepository.findAllById(Id);
    }

}
