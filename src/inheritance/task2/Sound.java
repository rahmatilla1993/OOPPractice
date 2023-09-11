package inheritance.task2;

public class Sound extends Electronics{
    protected String soundType; //stereo or mono
    protected int numberOfSpeakers;
    public Sound(String brand, float price, int warrantyYear, String soundType, int numberOfSpeakers) {
        super(brand, price, warrantyYear);
        this.soundType = soundType;
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "soundType='" + soundType + '\'' +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
