//WID(14/04/2026)(Sarthak Mittal)(DegamieSign)#1
import com.example.wirelesschargingapplication.DeviceListFragment;

import java.util.List;

@Repository
public interface DeviceListRepsitory extends JpaRepository<DeviceListFragment,String> {
    public List<DeviceListFragment>findByfraagmnetId(String fragmentId);
    public List<DeviceListFragment> saveAll();
}
