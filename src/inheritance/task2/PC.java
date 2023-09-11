package inheritance.task2;

public class PC extends Computer{
    private String motherBoard;
    private String gpu;

    public PC(String brand, float price, int warrantyYear,
              String processorType, int ramSize, int storageSize,
              String motherBoard, String gpu) {
        super(brand, price, warrantyYear, processorType, ramSize, storageSize);
        this.motherBoard = motherBoard;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "PC{" +
                "motherBoard='" + motherBoard + '\'' +
                ", gpu='" + gpu + '\'' +
                ", processorType='" + processorType + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
