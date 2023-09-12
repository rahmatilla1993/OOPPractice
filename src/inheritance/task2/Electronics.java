package inheritance.task2;

public class Electronics {

    protected String brand;
    protected float price;
    protected int warrantyYear;
    public Electronics() {}

    public Electronics(String brand, float price, int warrantyYear) {
        this.brand = brand;
        this.price = price;
        this.warrantyYear = warrantyYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
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
