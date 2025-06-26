@Repository
public interface BatteryRepository extends JpaRepository<Battery,String>{
    public String saveAllBWifiyId(long  WifiId);
    public String saveAllByBatteryId(String BatteryId);
    public String saveAllByBatteryName(String BatteryName);
}