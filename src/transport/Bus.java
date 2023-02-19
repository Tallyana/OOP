package transport;

public class Bus extends Transport {

    private int maxSpeed;
    private double engineVolume;

    private static final String noInfo = "Информация не указана";


    public Bus (String brand, String model, double engineVolume, String color, int year, String country) {
        super(brand, model, engineVolume, color, year, country);
    }
    public void startUp() {
        System.out.println(getBrand() + " Начать движение.");
    }

    public void stopEnd() {
        System.out.println(getBrand() + " Закончить движение.");
    }
}


