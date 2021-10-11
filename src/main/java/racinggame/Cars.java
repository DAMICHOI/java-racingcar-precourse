package racinggame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cars {
	private final List<Car> cars;

	public Cars(List<String> cars) {
		this.cars = initCar(cars);
	}

	/**
	 * 경주용 차 이름 입력
	 * @param cars 자동차 이름 리스트
	 * @return List<Car>
	 */
	private List<Car> initCar(List<String> cars) {
		List<Car> carList = new ArrayList<>();
		for (int i = 0; i < cars.size(); i++) {
			carList.add(new Car(cars.get(i)));
		}
		return carList;
	}

	public Map<String, Integer> raceStatusMap() {
		Map<String, Integer> carMap = new HashMap<>();
		for (Car car : cars) {
			carMap.put(car.getCarName(), car.getCarPosition());
		}
		return carMap;
	}

	public void race() {
		cars.forEach(Car::race);
	}
}
