package utils;

import static racinggame.domain.CarConst.*;

import racinggame.exception.RaceException;

public class Validation {
	public Validation() {
	}

	/**
	 * 입력받은 값의 유효성을 검증한다.
	 * @param inputValue 입력값
	 * @return boolean
	 */
	public static boolean inputValueCheck(String inputValue) {
		try {
			carNamesCheck(inputValue);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * 입력받은 값이 숫자인지 유효성을 검증한다.
	 * @param inputCount 입력값
	 * @return boolean
	 */
	public static boolean inputCountCheck(String inputCount) {
		try {
			raceCountCheck(inputCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * 레이스 횟수의 유효성을 검증한다.
	 * @param inputCount 입력값
	 */
	private static void raceCountCheck(String inputCount) {
		if (!inputCount.matches("[0-9]+")) {
			throw new RaceException(ErrorMessages.RACE_COUNT_ONLY_NUMBER);
		}
	}

	/**
	 * 입력받은 자동차 이름들의 유효성을 검사한다.
	 * @param carNames 자동차 이름들
	 */
	private static void carNamesCheck(String carNames) {
		for (String carName : carNames.split(STRING_SEPARATOR)) {
			carNameCheck(carName);
		}
	}

	/**
	 * 자동차 이름의 유효성을 검증한다.
	 * @param carName 자동차 이름
	 */
	public static void carNameCheck(String carName) {
		if (carName == null || carName.isEmpty()) {
			throw new RaceException(ErrorMessages.CAR_NAME_EMPTY_MESSAGE);
		}
		if (carName.length() > 5) {
			throw new RaceException(ErrorMessages.CAR_NAME_LENGTH_5_UP_MESSAGE);
		}
	}

}
