@Repository
public interface BatteryListenerRepository extends JpaRepository<batterylistner,String>{
    @Autowired
    public BatteryListener batterylistner;
    public  List<BatteryListener> saveAll(String BatteryId);
    public  List<BatteryListener> saveAllById(String BatteryId);
}