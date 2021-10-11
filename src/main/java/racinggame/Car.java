package racinggame;

public class Car {
	private CarName carName;
	private CarPosition carPosition;

	public Car(String name) {
		this.carName = new CarName(name);
		this.carPosition = new CarPosition();
	}

	public MoveStatus canMove(int number) {
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
}
