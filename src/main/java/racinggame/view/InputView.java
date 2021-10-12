package racinggame.view;

import static racinggame.view.ViewMessages.*;

import nextstep.utils.Console;

public class InputView {

	/**
	 * 경주할 자동차들의 이름을 입력받는다.
	 * @return String
	 */
	public String inputCarNames() {
		System.out.println(INPUT_CAR_NAMES);
		return Console.readLine();
	}

	/**
	 * 경주를 시도할 횟수를 입력받는다.
	 * @return int
	 */
	public int inputRaceCount() {
		System.out.println(INPUT_RACE_COUNT);
		return Integer.parseInt(Console.readLine());
	}
}
