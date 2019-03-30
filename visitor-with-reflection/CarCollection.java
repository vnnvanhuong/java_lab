import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CarCollection {

    private List<Car> cars = new ArrayList<>();

    public void attach(Car car) {
        cars.add(car);
    }

    public void accept(Visitor visitor) {
        cars.forEach(car -> car.accept(visitor));
    }

    public void print() {
        cars.forEach(car -> {
            try {
                Method getColor = car.getClass().getMethod("getColor");
                System.out.printf("---> %s - color: %s", car, getColor.invoke(car));
                System.out.println();
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
    
}