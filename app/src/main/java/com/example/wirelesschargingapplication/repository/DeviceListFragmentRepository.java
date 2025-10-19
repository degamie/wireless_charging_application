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
}
