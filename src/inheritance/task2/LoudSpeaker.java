package inheritance.task2;

public class LoudSpeaker extends Sound{
    private int powerRating;
    public LoudSpeaker(String brand, float price, int warrantyYear,
                       String soundType, int numberOfSpeakers, int powerRating) {
        super(brand, price, warrantyYear, soundType, numberOfSpeakers);
        this.powerRating = powerRating;
    }

    @Override
    public String toString() {
        return "LoudSpeaker{" +
                "powerRating=" + powerRating +
                ", soundType='" + soundType + '\'' +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
