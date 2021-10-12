package racinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cars {
	private static final String STRING_SEPERATOR = ",";
	private final List<Car> cars;

	public Cars(String carNames) {
		List<String> cars = Arrays.asList(carNames.split(STRING_SEPERATOR));
		this.cars = initCar(cars);
	}

	/**
	 * 경주용 자동차들의 이름을 입력하여 초기화한다.
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

	/**
	 * 자동차들의 상태를 Map으로 출력한다.
	 * @return Map<String, Integer>
	 */
	public Map<String, Integer> raceStatusMap() {
		Map<String, Integer> carMap = new HashMap<>();
		for (Car car : cars) {
			carMap.put(car.getCarName(), car.getCarPosition());
		}
		return carMap;
	}

	/**
	 * 자동차들이 주행한다.
	 */
	public void race() {
		cars.forEach(Car::race);
	}

	public Car get(int i) {
		return cars.get(i);
	}

	/**
	 * 레이스의 승자를 구한다.
	 * @return String
	 */
	public String raceWinner() {
		String winner = "";
		int farthestPosition = farthestPosition();
		for (Car car : cars) {
			winner += (car.getCarPosition() == farthestPosition) ?
				(winner.length() == 0) ? car.getCarName() : "," + car.getCarName() : "";
		}
		return winner;
	}

	/**
	 * 자동차들 중 가장 먼 위치 값을 구한다.
	 * @return int
	 */
	private int farthestPosition() {
		int farthestPosition = 0;
		for (Car car : cars) {
			farthestPosition = Math.max(car.getCarPosition(), farthestPosition);
		}
		return farthestPosition;
	}
}
