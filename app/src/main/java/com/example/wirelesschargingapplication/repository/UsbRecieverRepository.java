@Repository
public interface UsbRecieverRepository extends JpaRepository<UsbReciever,String> {
    public List<UsbReciever> saveAll();
    public void findAllByProductId(Long ProductId);//binding ProductiD in it 
    public  String getProudctId(Long ProductId);

}
