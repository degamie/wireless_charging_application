@Controller
public class DeviceListController{
    @Service
    public DeviceListFragmentService deviceListService;
    @PostMapping("/findAll/{SerailId}")
    public String setAlldserialById(String serialId){
        return  deviceListService.findAlldserialById(serialId);
    }

}
