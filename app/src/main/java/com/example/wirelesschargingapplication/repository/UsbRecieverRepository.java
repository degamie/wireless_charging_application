//WID(16/01/2026)(Degamiesign)(Sarthak Mittal)
import android.health.connect.datatypes.Device;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever.UsbReciever;

import javax.naming.Context;
import java.util.List;


@Repository
public interface UsbRecieverRepository extends JpaRepository<UsbReciever,String> {
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
