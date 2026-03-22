//WID(22/03/2026)(Degamiesign)(Sarthak Mittal)#1.1.1.1.1.1.1.1.1.1.1.1C.1.1
//import android.health.connect.datatypes.Device;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever.UsbReciever;
import com.google.wireless.android.sdk.stats.LiveEditEvent;

import javax.naming.Context;
import java.util.List;


@Repository
public interface UsbRecieverRepository extends JpaRepository<UsbReciever,String> {
    public List<Device>saveByProdName(String ProductName);
public List<LiveEditEvent.Device>setDevice(ListEditevent.Device device);
    public List<LiveEditEvent.Device>getDevice(LiveEditEvent.Device device);
    public List<UsbReciever>existsByProductId(String ProductId);
    public List<UsbReciever> updateByProductId(String ProductID);
    public List<UsbReciever> findByUsbReciever(UsbReciever usbReciever);
    public List<UsbReciever> finndAll();
    public List<UsbRecieverRepository> saveByUsbRecieverrepository(UsbRecieverRepository usbRecieverRepository);
    public List<UsbReciever> savebYUsBReciever(UsbReciever usbReciever);
    public UsbRecieverRepository usbRecieverRepository;
    public List<UsbReciever> findByUsbRecieverRepository(UsbRecieverRepository usbRecieverRepository);
    public void existsByusbRecieverRepository(UsbRecieverRepository usbRecieverRepository){if(usbRecieverRepository.length>0)getUsbRecieverRepository(usbRecieverRepository);}//Chekcing UsbReciever's Repo in App
    public void updateusbRecieverRepository(UsbRecieverRepository usbRecieverRepository){getUsbRecieverRepository(usbRecieverRepository)+setUsbRecieverRepository(usbRecieverRepository)+1;}//Updating UsbReciever in App
    public void setUsbRecieverRepository(UsbRecieverRepository usbRecieverRepository){this.usbRecieverRepository=usbRecieverRepository;}//Binding usbRecieverRepository in App
    public UsbRecieverRepository getUsbRecieverRepository(UsbRecieverRepository usbRecieverRepository){return usbRecieverRepository;}//Fetching UsbRecieverRepo in App
    public List<UsbReciever> saveAll();
    public String saveAllByContext(Context context);//Fetching Context In UsbReciever
    public  String getProudctId(String ProductId);
    public String findAllByProductId(String ProductId);
    public String getAllVendorID(String VendorID);
    public String findAllByVendorId(String VendorID);//only in repo Changes//Impl TBC//
    public String saveAllByCameraVID(String CameraVID);
    public void findAllByCameraVID(String CameraVID);//Binding CameraVID IN Server
    public String saveAllByDevice(Device device);
    public String saveAllByCameraPID(String CameraPID);
    public String findAllByCameraPID(String CameraPID);
    public String udpateAllByCameraPID(String CameraPID);
    public List<String> findByDevice(Device device);
    public List<UsbReciever> savebyProductId(String ProductId);
    public List<UsbReciever> updateByProductID(String ProductId);
    public List<UsbReciever> existsByProductID(String ProductId);//Checking All ProductId in Server
}
