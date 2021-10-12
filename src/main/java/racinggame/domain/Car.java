package racinggame.domain;

import static racinggame.domain.CarConst.*;

import nextstep.utils.Randoms;

public class Car {

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
		return number >= MOVE_STANDARD_NUMBER ? MoveStatus.GO : MoveStatus.STOP;
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

	public String print() {
		return carName.toString() + " : " + carPosition.toString();
	}
}
