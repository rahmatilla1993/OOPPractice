package inheritance.task2;

public class Computer extends Electronics{
    protected String processorType;
    protected int ramSize;
    protected int storageSize;
    public Computer(String brand, float price, int warrantyYear,
                    String processorType, int ramSize, int storageSize) {
        super(brand, price, warrantyYear);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorType='" + processorType + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
