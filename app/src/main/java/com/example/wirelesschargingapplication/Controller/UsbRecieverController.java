import android.health.connect.datatypes.Device;

@Component
@Controller

public class UsbRecieverController {//Class Declare
    @Autowired
    public UsbRecieverService usbRecieverService;//Injecting usbRecieverService's Lib

    @GetMapping("/save/{ProductId}")
    public String getProudctId(@PathVariable "ProductId"String ProductId, @RequestBody UsbReciever) {//Fetching ProductId
        return usbRecieverService.getProudctId(ProductId);
    }

    @PostMapping("/findAll/{ProductId}")
    public String setAllByProductId(String ProductId) {
        return usbRecieverService.findAllByProductId(ProductId);
    }

    @GetMapping("/saveAll/{VendorID}")
    public String getAllVendorID(String VendorID) {
        return usbRecieverService.getAllVendorID(VendorID);//Fetching VendorId in Server
    }

    @GetMapping("/saveAll/{CameraVID}")
    public String getAllByCameraVID(String CameraVID) {
        return usbRecieverRepository.saveAllByCameraVID(CameraVID);
    }
    @GetMapping("/saveAll/{device}")
    public String getAllByDevice(Device device) {
        return usbRecieverRepository.saveAllByDevice(device);
    }
    @GetMapping("")
    public String getAllByCameraPID(String CameraPID){
        return usbRecieverRepository.saveAllByCameraPID(CameraPID);
    }
}


