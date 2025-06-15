@Repository
public interface DeviceListRepsitory extends JpaRepository<DeviceListFragment,String> {
    public List<DeviceListFragment> saveAll();
}
