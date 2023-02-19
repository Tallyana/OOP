package transport;

public class Transport {
    private  String brand;
    private String model;
    private  int year;
    private  String country;
    private  String color;
    private int maxSpeed;

    private static final String noInfo = "Информация не указана";


    public Transport(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;
        if (model == null || model.isEmpty()) this.model = noInfo;
        else this.model = model;
        if (color == null || color.isEmpty()) this.color = "белый";
        else this.color = color;
        if (year <= 0) this.year = 2000;
        else this.year = year;
        if (country == null || country.isEmpty()) this.country = noInfo;
        else this.country = country;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return getEngineVolume();
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty())
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public  String toString(){
        return brand +" " +model+", " +year+" года выпуска, сборка в "+country+", " +color+" цвет кузова, объём двигателя -" +" л.";
    }



}

