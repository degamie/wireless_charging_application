@Service
public class UsbRecieverService{
    @Autowired
    public UsbRecieverRepository usbRecieverRepository;
    public  String getProudctId(String ProductId){
        return usbRecieverRepository.saveAllProudctId(ProductId);
    }
}
