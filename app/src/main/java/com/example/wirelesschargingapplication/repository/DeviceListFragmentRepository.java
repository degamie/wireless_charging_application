//WID(14/01/2026)(DegamieSign)(Sarthak Mittal)
import com.example.wirelesschargingapplication.DeviceListFragment;

import java.util.List;

@Repository
public interface DeviceListRepsitory extends JpaRepository<DeviceListFragment,String> {  //Fetching and Retrieving All DeviceListFragment's Params
    public List<DeviceListFragment> saveAll();
    public String findAll();
    public String findAlldserialById(String serialId);
    public String saveAlldserialById(String serialId);
    public String saveAllByDeviceName(String DeviceName);
    public String saveAllByPort(String Port);
    public void findAllByPort(String port);
    public String updateByPort(String port);
    public void findByDeviceName(String  DeviceName);
    public String saveByDeviceName(String DeviceName);
}
