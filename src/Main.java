

public class Main {
    public static void main(String[] args) {

        Auto lada = new Auto("Lada", "Granta", 1.7, " металлик", 2015, "России");
        Auto audi = new Auto("Audi", "A8 ", 3.0, "черный", 2020, "Германии");
        Auto bmv = new Auto("BMV", null, 3.0, null, 2021, "Германии");
        Auto kia = new Auto("KIA", "Sportage", 2.4, "красный", 2018, "Южной Корее");
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "желтый", 2016, "Южной Корее");

         //1.dva sposoba vyvoda :
            System.out.println(lada.toString());
            System.out.println(audi.toString());
            System.out.println(bmv.toString());
            System.out.println(kia.toString());
            System.out.println(hyundai.toString());

        System.out.println("=================================");

            //2.
            Auto[] cars = {lada, audi, bmv, kia, hyundai};
            for (Auto car : cars) {
                System.out.println(car);
        }
    }
}

