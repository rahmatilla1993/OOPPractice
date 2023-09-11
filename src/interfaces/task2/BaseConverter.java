package interfaces.task2;

public class BaseConverter implements Convertable {

    private float celsius;

    public BaseConverter(float celsius) {
        this.celsius = celsius;
    }


    @Override
    public float convertToFahrenheit() {
        return celsius * ((float) 9 / 5) + 32;
    }

    @Override
    public float convertToKelvin() {
        return (float) (celsius + 273.15);
    }
}
