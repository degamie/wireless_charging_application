@Controller
public class DeviceListController{
    @Service
    public DeviceListFragmentService deviceListService;
    @PostMapping("/findAll/{SerailId}")
    public String setAlldserialById(String serialId){
        return  deviceListService.findAlldserialById(serialId);
    }
    @GetMapping("/saveAll/{serialId}")
    public String getAlldserialById(String serialId){//Fetching All SerialIds
        return deviceListService.saveAlldserialById(serialId);
    }
    @GetMapping("/saveAll/{Port}")
    public String getAllByPort(String Port){
        return deviceListService.getAllByPort   (Port);
    }

}
