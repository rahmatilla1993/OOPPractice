package inheritance.task2;

public class Laptop extends Computer{
    private float screenSize;
    private int batteryLife;
    public Laptop(String brand, float price, int warrantyYear,
                  String processorType, int ramSize, int storageSize,
                  float screenSize, int batteryLife) {
        super(brand, price, warrantyYear, processorType, ramSize, storageSize);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", batteryLife=" + batteryLife +
                ", processorType='" + processorType + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
