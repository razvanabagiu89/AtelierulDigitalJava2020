package lab6.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1990, (float) 2000.0, "Car1"));
        cars.add(new Car(2019, (float) 2000.0, "Car2"));
        cars.add(new Car(2016, (float) 2000.0, "Car3"));
        cars.add(new Car(2016, (float) 2003.0, "Car4"));

        Collections.sort(cars);
        System.out.println(cars);
    }
}
