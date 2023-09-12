package inheritance.task2;

public class Subwoofer extends Sound{
    private float subwooferSize;
    public Subwoofer() {}

    public Subwoofer(String brand, float price, int warrantyYear,
                     String soundType, int numberOfSpeakers, float subwooferSize) {
        super(brand, price, warrantyYear, soundType, numberOfSpeakers);
        this.subwooferSize = subwooferSize;
    }

    public float getSubwooferSize() {
        return subwooferSize;
    }

    public void setSubwooferSize(float subwooferSize) {
        this.subwooferSize = subwooferSize;
    }

    @Override
    public String toString() {
        return "Subwoofer{" +
                "subwooferSize=" + subwooferSize +
                ", soundType='" + soundType + '\'' +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
