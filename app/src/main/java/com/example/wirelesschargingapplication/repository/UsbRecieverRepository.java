@Repository
public interface UsbRecieverRepository extends JpaRepository<UsbReciever,String> {
    public List<UsbReciever> saveAll();
    public  String getProudctId(String ProductId);
    public String findAllByProductId(String ProductId);
    public String getAllVendorID(String VendorID);
    public String findAllByVendorId(String VendorID);//only in repo Changes//Impl TBC//
}
