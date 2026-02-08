//WID(8/2/2025)//Sarthak Mittal aka Degamiesign #1.1    
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.WifiDetails;

@Repository
public interface WifiDetailsRepository extends JpaRepository<WifiDetails,String>{
    public void findBynetwoekId(Integer networkId);
    public void findAllByNetworkSpeed(double networkSpeed);
public double saveAllByNetworkSpeed(double networkSpeed);
public String updateAllByNetworkSpeed(double networkSpeed);//Updating NetworkSpeed in App
    public void updateByNetworkSpeed(double networkSpeed);
public void findAllByNetworkId(long networkId);
public String saveAllByNetworkId(long NetworkId);
public void findAllByIpv6(String ipv6);
public String saveAllByipV6(String ipv6);
public String updateAllbyipv6(Stringn ipv6);

}