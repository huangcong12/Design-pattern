import sun.print.CUPSPrinter;
import sun.security.krb5.internal.APRep;

public class CurrentConditionsDisplay implements Observe {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions:" + temperature + ",F degree and " + humidity + "% humidity");
    }
}
