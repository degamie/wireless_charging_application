import com.example.wirelesschargingapplication.DeviceListFragment;

import java.util.List;
//WID(19/11/2025)
@Repository
public interface DeviceListRepsitory extends JpaRepository<DeviceListFragment,String> {
    public List<DeviceListFragment> saveAll();
    public String findAllByDeviceName(String DeviceName);//Retriving DeviceName's Binding in ListFragment
}
