@Component
@Controller

public class UsbRecieverController{//Class Declare
    @Autowired
    public UsbRecieverService usbRecieverService;//Injecting usbRecieverService's Lib
   @GetMapping("/save/{ProductId}")
   public  String getProudctId(@PathVariable "ProductId" String ProductId,@RequestBody UsbReciever){//Fetching ProductId
       return usbRecieverService.getProudctId(ProductId);
   }
    @PostMapping("/findAll/{ProductId}")//ProductId's Retrieval in Server
    public String setAllByProductId(String ProductId){
        return usbRecieverRepository.findAllByProductId(ProductId);
    }
}