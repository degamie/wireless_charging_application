//WID(16/04/2026)(Sarthak Mittal)(DegamieSign)#1.1
import com.example.wirelesschargingapplication.DeviceListFragment;

import java.util.List;

@Repository
public interface DeviceListRepsitory extends JpaRepository<DeviceListFragment,String> {
    public List<DeviceListFragment>saveByfragmentId(String fragmentId);
    public List<DeviceListFragment>findByfraagmnetId(String fragmentId);
    public List<DeviceListFragment> saveAll();
}
