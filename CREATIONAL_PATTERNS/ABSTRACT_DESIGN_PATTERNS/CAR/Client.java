public class Client {

    public static void main(String args[])
    {
        VehicleAbstractFactory vaf = VehicleFactory.getVehicle("Luxury");
        Vehicle v1 = vaf.createVehicle("Mercedes");
        v1.getBrandName();
    }
}