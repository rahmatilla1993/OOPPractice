package inheritance.task2;

public class Electronics {

    protected String brand;
    protected float price;
    protected int warrantyYear;

    public Electronics(String brand, float price, int warrantyYear) {
        this.brand = brand;
        this.price = price;
        this.warrantyYear = warrantyYear;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", warrantyYear=" + warrantyYear +
                '}';
    }
}
