//WID(28/03/2026)(DegamieSign)(Sarthak Mittal)#1.1.1.1.1.1.1.1C.1c.1.1.1
import com.example.wirelesschargingapplication.DeviceListFragment;

import java.util.List;

@Repository
public interface DeviceListRepsitory extends JpaRepository<DeviceListFragment,String> {  //Fetching and Retrieving All DeviceListFragment's Params
    public List<DeviceListFragment>udpateByPortNum(String PortNum);
    public List<DeviceListFragment> saveByPortNum(String PortNum);
    public List<DeviceListFragment> findByportNum (String portNum);
//    public
    public List<DeviceListFragment> existsByDeviceName(String DeviceName);
    public List<DeviceListFragment> savebyDevicelIstFragment();
    public DeviceListFragment devicelistfragment = null;
    public List<DeviceListFragment> findByDeviceListFragement(DeviceListFragment devicelistfragment);
    public void updateByDeviceListFragment(DeviceListFragment devicelistfragment);
    public List<DeviceListFragment> getDeviceListFragment(DeviceListFragment devicelistfragment);
    public   void setDeviceListFragement(DeviceListFragment devicelistfragment);
    public List<DeviceListFragment>saveByDeviceListFragment(DeviceListFragment devicelistfragment);
    public List<DeviceListFragment> findByDeviceListFragment(DeviceListFragment devicelistfragment);
    public List<DeviceListFragment> saveAll();
    public String findAll();
    public String findAlldserialById(String serialId);
    public String saveAlldserialById(String serialId);
    public String saveAllByDeviceName(String DeviceName);
    public void updateByDeviceName(String DeviceName);//Updating DeviceName in App
    public String saveAllByPort(String Port);
    public void findAllByPort(String port);
    public String updateByPort(String port);
    public void findByDeviceName(String  DeviceName);
    public String saveByDeviceName(String DeviceName);
}
