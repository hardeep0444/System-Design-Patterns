public class VehicleFactory {

    public static VehicleAbstractFactory getVehicle(String type)
    {
        if(type == "Luxury")
        {
            return new LuxuryFactory();
        }
        else
        {
            return new OrdinaryFactory();
        }
    }
    
}
