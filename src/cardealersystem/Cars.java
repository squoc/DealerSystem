package cardealersystem;

import java.util.ArrayList;
import java.util.List;

public class Cars{
    private static List<Car> cars = new ArrayList<>();

    public static void seedCars() {
        for (int i = 0; i < 5; i++) {
            Car temp = new Car("vin" + i, "make" + i, "color" + i, 0+i, 0+i, 10000 + i, 10 + i, 100 + i);
            cars.add(temp);
        }
    }

    public static Car findCar(String vin) {
        for (Car c :
                cars) {
            if (c.getVIN().equals(vin)) {
                return c;
            }
        }
        return null;
    }
}

