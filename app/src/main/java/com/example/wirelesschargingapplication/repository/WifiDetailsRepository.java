@Repository
public interface WifiDetailsRepository extends JpaRepository<WifiDetails,String>{
public double saveAllByNetworkSpeed(double networkSpeed);

}