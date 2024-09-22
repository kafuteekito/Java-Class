public class Main {
    public static void main(String[] args) {
        Smartphone Poco = new Smartphone();
        Poco.model = "Poco X3";
        Poco.brand = "Xiaomi";
        Poco.memorySize = 128;
        Poco.price = 20990;
        Poco.batteryCapacity = 5160;
        Poco.screenSize = 6.67;
        Poco.camera = 64;

        Smartphone Iphone = new Smartphone("iPhone 15 Pro Max", "Apple", 512, 164990, 4441, 6.7, 48);
        Iphone.memorySize = 512;

        Smartphone Google = new Smartphone();
        Google.model = "Pixel 10";
        Google.brand = "Google";

        System.out.println("There is some smartphones you can buy in our store:");
        Poco.displayInfo();
        Iphone.displayInfo();
        System.out.println("Coming soon: ");
        Google.displayInfo();
    }
}