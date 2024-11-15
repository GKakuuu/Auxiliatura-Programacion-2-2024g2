package lab3;

public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    private int range;

    public ElectricVehicle(String brand, String model, double price, double batteryCapacity, int range) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public ElectricVehicle(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }
    
    public void displayRange() {
        System.out.println("Range: " + range + " km");
    }
    
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}