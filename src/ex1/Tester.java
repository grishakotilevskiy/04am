package ex1;

 abstract class Device {
   protected String brand;
    protected String model;
    protected boolean powerStatus = false;

    Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    void turnOn(){
        powerStatus = true;
        System.out.println("The device is now ON");
    }

   void turnOff(){
        powerStatus = false;
        System.out.println("The device is now OFF");
    }

     abstract void displayInfo();

}
class Smartphone extends Device {
    Smartphone(String brand, String model, boolean powerStatus) {
        super(brand, model, powerStatus);
    }

    @Override
    void displayInfo() {
        System.out.println("Smartphone Brand: " + brand);
        System.out.println("Smartphone Model: " + model);
        System.out.println("Power Status: " + (powerStatus ? "ON" : "OFF"));
    }
}
public class Tester {
    public static void main(String[] args) {
        Smartphone device = new Smartphone("Samsung", "Galaxy", true);
        device.displayInfo();

    }
}