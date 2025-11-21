import android.health.connect.datatypes.Device;

import javax.naming.Context;

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
}
