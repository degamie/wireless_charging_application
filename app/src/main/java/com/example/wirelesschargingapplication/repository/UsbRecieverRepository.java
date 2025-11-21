import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.UsbReciever.UsbReciever;

import java.util.List;

@Repository
public interface UsbRecieverRepository extends JpaRepository<UsbReciever,String> {
    public List<UsbReciever> saveAll();
    public void findAllByProductId(Long ProductId);//binding ProductiD in it
    public  String getProudctId(Long ProductId);
    public String saveAllByProductName(String ProductName);

}
