@Service
public class UsbRecieverService{
    @Autowired
    public UsbRecieverRepository usbRecieverRepository;
    public  String getProudctId(String ProductId){
        return usbRecieverRepository.saveAllProudctId(ProductId);
    }
    public String setAllByProductId(String ProductId){
        return usbRecieverRepository.findAllByProductId(ProductId);
    }
    public String getAllVendorID(String VendorID){
        return  usbRecieverRepository.saveAll(VendorID);
    }
    public String getAllByCameraVID(String CameraVID){return usbRecieverRepository.saveAllByCameraVID(CameraVID);}
    public String getAllByDevice(Device device){
        return usbRecieverRepository.saveAllByDevice(device);
    }
    public String getAllByCameraPID(String CameraPID){
        return usbRecieverRepository.saveAllByCameraPID(CameraPID);
    }
    public String setAllByCameraPID(String CameraPID){
        return  usbRecieverRepository.findAllByCameraPID(CameraPID);
    }
}
