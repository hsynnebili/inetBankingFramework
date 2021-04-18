package MapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarDemo {

	public static void main(String[] args) {

		Map<Integer, Car> car = new LinkedHashMap<>();
		Car car1 = new Car("Toyota", 2012, "Corolla");
		Car car2 = new Car("Honda", 2005, "Civic");
		Car car3 = new Car("Audi", 2019, "A6");
		Car car4 = new Car("Mercedes", 2015, "CLK");
		Car car5 = new Car("Nissan", 2013, "Manan");

		car.put(1, car1);
		car.put(2, car2);
		car.put(3, car3);
		car.put(4, car4);
		car.put(5, car5);

		Iterator<Map.Entry<Integer, Car>> it = car.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Car> entry = it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue().carName + " " + entry.getValue().modelYear + " "
					+ entry.getValue().modelName);

		}

	}
}
