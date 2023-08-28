public class OrdinaryFactory extends VehicleAbstractFactory{
    @Override
    public Vehicle createVehicle(String brand) {
        if(brand == "Maruti")
        {
            return new Maruti();
        }
        else if (brand == "Honda")
        {
            return new Honda();
        }
        else
            return null;
    }
}
