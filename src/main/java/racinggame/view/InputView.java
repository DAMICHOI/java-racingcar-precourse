package racinggame.view;

import nextstep.utils.Console;

public class InputView {
	private static final String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_RACE_COUNT = "시도할 회수는 몇회인가요?";

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
