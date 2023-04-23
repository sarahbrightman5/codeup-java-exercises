package vehicle;

public class Truck extends Vehicle {
    public void makeNoise() {
        System.out.println("chuga-chuga");
    }

    public void breakingDownNoise() {
        super.makeNoise();
        System.out.println("clack clack");
    }
}
