public class LuxuryFactory extends VehicleAbstractFactory{
    @Override
    public Vehicle createVehicle(String brand) {
        if(brand == "Mercedes")
        {
            return new Mercedes();
        }
        else if (brand == "BMW")
        {
            return new Bmw();
        }
        else
            return null;
    }
}
