
@Service
public class DeviceListService{
    @Autowired
    public DeviceListRepository deviceListRepository;
    public String setAlldserialById(String serialId){
        return  deviceListRepository.findAlldserialById(serialId);
    }
}