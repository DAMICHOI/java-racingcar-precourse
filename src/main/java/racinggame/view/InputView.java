package racinggame.view;

import static racinggame.view.ViewMessages.*;

import nextstep.utils.Console;
import racinggame.exception.RaceException;
import utils.Validation;

public class InputView extends RaceException {

	/**
	 * 경주할 자동차들의 이름을 입력받는다.
	 * @return String
	 */
	public String inputCarNames() {
		String carNames;
		do {
			System.out.println(INPUT_CAR_NAMES);
			carNames = Console.readLine();
		} while (!Validation.inputValueCheck(carNames));
		return carNames;
	}

	/**
	 * 경주를 시도할 횟수를 입력받는다.
	 * @return int
	 */
	public int inputRaceCount() {
		String raceCount;
		do {
			System.out.println(INPUT_RACE_COUNT);
			raceCount = Console.readLine();
		} while (!Validation.inputCountCheck(raceCount));
		return Integer.parseInt(raceCount);
	}
}
