package racinggame.domain;

import utils.Validation;

public class CarName {
	private String carName;
	private Validation validation = new Validation();

	public CarName(String carName) {
		validation.carNameCheck(carName);
		this.carName = carName;
	}

	@Override
	public String toString() {
		return carName;
	}
}
