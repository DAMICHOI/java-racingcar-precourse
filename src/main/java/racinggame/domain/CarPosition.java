package racinggame.domain;

import static racinggame.domain.CarConst.*;

public class CarPosition {

	private int position;

	public CarPosition() {
		this.position = CAR_POSITION_INIT;
	}

	public int increase() {
		return this.position++;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public String toString() {
		StringBuilder marker = new StringBuilder();
		for (int i = 0; i < position; i++) {
			marker.append("-");
		}
		return marker.toString();
	}
}
