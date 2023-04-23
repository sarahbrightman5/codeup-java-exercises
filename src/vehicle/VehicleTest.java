package vehicle;

import birds.Quaker;

public class VehicleTest {
        public static void main(String[] args) {
//            Truck truck = new Truck();
//            truck.setInstace("Truck");
//            truck.makeNoise();
//            truck.breakingDownNoise();
//            Motorcycle bike = new Motorcycle();
//            bike.makeNoise();
//            Car car = new Car();
//            car.makeNoise();
            Garage garage = new Garage();
            garage.vehicles = new Vehicle[3];
            garage.vehicles[0] = new Motorcycle();
            garage.vehicles[1]= new Car();
            garage.vehicles[2]= new Truck();
            garage.alarmCascade();
        }

}
