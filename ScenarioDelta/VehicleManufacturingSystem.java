package ScenarioDelta;
// using Factory design Pattern
public class VehicleManufacturingSystem {
    public static void main(String[] args) {
        
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.assemble();

        
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.assemble();

        
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.assemble();
    }
}
