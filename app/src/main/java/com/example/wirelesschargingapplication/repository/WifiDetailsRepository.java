import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.WifiDetails;

//WID(27/10/2025)//Degamiesign
@Repository
public interface WifiDetailsRepository extends JpaRepository<WifiDetails,String>{
    public void findAllByNetworkSpeed(double networkSpeed);
public double saveAllByNetworkSpeed(double networkSpeed);
public void findAllByNetworkId(long networkId);
public String saveAllByNetworkId(long NetworkId);

}