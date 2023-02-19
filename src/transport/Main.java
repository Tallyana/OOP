package transport;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, " металлик", 2015, "России");
        Car audi = new Car("Audi", "A8 ", 3.0, "черный", 2020, "Германии");
        Car bmv = new Car("BMV", null, 3.0, null, 2021, "Германии");
        Car kia = new Car("KIA", "Sportage", 2.4, "красный", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "желтый", 2016, "Южной Корее");

        Bus ikarus = new Bus("Ikarus", "452", 8.0, " металлик", 2011, "России");
        Bus lias = new Bus("Lias", "A866 ", 5.0, "черный", 2018, "Германии");
        Bus toyota = new Bus("Toyota", null, 7.0, null, 2019, "japan");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmv.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
        System.out.println(ikarus.toString());
        System.out.println(lias.toString());
        System.out.println(toyota.toString());
    }
}
