//WID(27/10/2025)//Degamiesign
@Repository
public interface WifiDetailsRepository extends JpaRepository<WifiDetails,String>{
    public void findAllByNetworkSpeed(double networkSpeed);
public double saveAllByNetworkSpeed(double networkSpeed);
public void findAllByNetworkId(long networkId);

}