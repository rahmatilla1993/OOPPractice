package methodoverloading.task1;

import oopintroduce.task1.GearBox;

public class Car {
    private String color;
    private String model;
    private float price;
    private GearBox gearBox;

    public Car(String color, String model, float price, GearBox gearBox) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.gearBox = gearBox;
    }

    public void info() {
        System.out.printf("Car=[color=%s, model=%s, price=%f, gearBox=%s]",
                color, model, price, gearBox.toString());
    }
}
