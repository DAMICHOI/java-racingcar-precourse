package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.view.InputView;
import racinggame.view.OutputView;

public class RaceController {

	private final InputView inputView;
	private final OutputView outputView;
	private Cars cars;

	public RaceController() {
		this.inputView = new InputView();
		this.outputView = new OutputView();
	}

	/**
	 * 경기를 시작한다.
	 */
	public void run() {
		cars = new Cars(inputView.inputCarNames());
		int raceCount = inputView.inputRaceCount();
		while (raceCount > 0) {
			raceCars();
			raceCount--;
		}
		raceWinner();
	}

	/**
	 * 경기를 진행한다.
	 */
	private void raceCars() {
		cars.race();
		outputView.finishMessage();
		outputView.racePrint(cars.raceResult());
	}

	/**
	 * 경기의 승자를 출력한다.
	 */
	private void raceWinner() {
		outputView.raceWinner(cars.raceWinner());
	}
}
