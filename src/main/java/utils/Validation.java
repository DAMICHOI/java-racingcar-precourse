package utils;

public class Validation {
	public Validation() {
	}

	/**
	 * 자동차 이름 유효성 검증
	 * @param carName 자동차 이름
	 */
	public void carNameCheck(String carName) {
		if (carName == null || carName.isEmpty()) {
			throw new IllegalArgumentException(ErrorMessages.CAR_NAME_EMPTY_MESSAGE);
		}
		if (carName.length() > 5) {
			throw new IllegalArgumentException(ErrorMessages.CAR_NAME_LENGTH_5_UP_MESSAGE);
		}
	}
}
