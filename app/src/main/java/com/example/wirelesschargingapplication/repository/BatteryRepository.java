@Repository
public interface BatteryRepository extends JpaRepository<Battery,String>{
    public String saveAllByBatteryId(String BatteryId);
}