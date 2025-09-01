@Component
@Controller

public class UsbRecieverController{//Class Declare
    @Autowired
    public UsbRecieverService usbRecieverService;//Injecting usbRecieverService's Lib
   @GetMapping("/save/{ProductId}")
   public  String getProudctId(@PathVariable "ProductId" String ProductId,@RequestBody UsbReciever){//Fetching ProductId
       return usbRecieverService.getProudctId(ProductId);
   }
    @PostMapping("/findAll/{ProductId}")
    public String setAllByProductId(String ProductId){
        return usbRecieverService.findAllByProductId(ProductId);
    }
    @GetMapping("/saveAll/{VendorID}")
    public String getAllVendorID(String VendorID){
        return  usbRecieverService.getAllVendorID(VendorID);//Fetching VendorId in Server
    }
