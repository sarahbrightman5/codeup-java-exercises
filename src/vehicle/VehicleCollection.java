package vehicle;

import java.util.ArrayList;

public class VehicleCollection {
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        truck.setInstace("Truck");
        Vehicle car = new Car();
        car.setInstace("car");
        Vehicle motorcycle = new Motorcycle();
        motorcycle.setInstace("motorcycle");

        ArrayList<Vehicle> vehiclesList = new ArrayList<>();
        vehiclesList.add(truck);
        vehiclesList.add(car);
        vehiclesList.add(motorcycle);
        vehiclesList(car);
        vehiclesList(motorcycle);
        for(Vehicle vehicle : vehiclesList){
            System.out.println(vehicle.getInstace());
        }

    }

    private static void vehiclesList(Vehicle car) {
    }
}
