package ex1;

abstract class Appliance {
    String brand;
    String model;

Appliance(String brand, String model){
    this.brand = brand;
    this.model = model;
}

    abstract void displayInfo();

}
