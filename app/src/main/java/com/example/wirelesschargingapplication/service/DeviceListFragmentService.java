public  class DeviceListFragmentService{
    public DeviceListFragementRepository deviceListFragementRepository;
    public String getAlldserialById(String serialId){
        return deviceListFragementRepository.saveAlldserialById(serialId);
    }


    }