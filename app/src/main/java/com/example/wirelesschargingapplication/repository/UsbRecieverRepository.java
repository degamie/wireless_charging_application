@Repository
public interface UsbRecieverRepository extends JpaRepository<UsbReciever,String> {
    public List<UsbReciever> saveAll();
    public  String getProudctId(String ProductId);
}
