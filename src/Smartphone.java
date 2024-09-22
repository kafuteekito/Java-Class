import java.security.PublicKey;

public class Smartphone {
    public String model;
    public String brand;
    public int memorySize;
    public int price;
    public int batteryCapacity;
    public double screenSize;
    public int camera;

    public Smartphone() {
        this.model = "No Information";
        this.brand = "No Information";
        this.memorySize = 0;
        this.price = 0;
        this.batteryCapacity = 0;
        this.screenSize = 0;
        this.camera = 0;
    }

    public Smartphone(String model, String brand, int memorySize, int price, int batteryCapacity, double screenSize, int camera ) {
        this.model = model;
        this.brand = brand;
        this.memorySize = memorySize;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
        this.camera = camera;
    }

    public void displayInfo(){
        System.out.println(brand + " " + model + " " + memorySize + "Gb ");
        System.out.println("Battery Capacity " + batteryCapacity + "mAh ");
        System.out.println("Screen Size: " + screenSize + " inch ");
        System.out.println("Camera: " + camera + " MP");
        System.out.println("Cost: " + price + " som");
        System.out.println();
    }

}
