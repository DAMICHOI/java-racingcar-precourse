package racinggame;

import nextstep.utils.Randoms;

public class Car {
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 9;
	private CarName carName;
	private CarPosition carPosition;

	public Car(String name) {
		this.carName = new CarName(name);
		this.carPosition = new CarPosition();
	}

	public void race() {
		MoveStatus moveStatus = canMove(getRandomNumber());
		move(moveStatus);
	}

	public static int getRandomNumber() {
		return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
	}

	public static MoveStatus canMove(int number) {
		if (number >= 4) {
			return MoveStatus.GO;
		}
		return MoveStatus.STOP;
	}

	public CarPosition move(MoveStatus status) {
		if (status.isGo()) {
			carPosition.increase();
		}
		return carPosition;
	}

	public String getCarName() {
		return carName.toString();
	}

	public int getCarPosition() {
		return carPosition.getPosition();
	}
}
