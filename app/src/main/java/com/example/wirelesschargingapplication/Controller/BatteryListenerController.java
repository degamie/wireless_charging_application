import javax.naming.Context;
@Controller
public class BatteryListenerController{
@Autowired
 public BattteryListenerService battteryListenerService;

@GetMapping("/save/{context}")
    public String getAllBatteryContext(@RequestBody Context context){

    return battteryListenerService.getAllBatteryContext(context);
    }
