package racinggame.view;

import static java.lang.String.*;

public class OutputView {
	private static final String OUTPUT_FINISH_MESSAGE = "실행 결과";
	private final String OUTPUT_RACE_WINNER = "최종 우승자는 %s 입니다.";

	/**
	 * 레이스 끝난 후 종료 메시지를 출력한다.
	 */
	public void finishMessage() {
		System.out.println(OUTPUT_FINISH_MESSAGE);
	}

	/**
	 * 경기 진행상황을 출력한다.
	 * @param raceResult 경기 결과
	 */
	public void racePrint(String raceResult) {
		System.out.println(raceResult);
	}

	/**
	 * 경기 승자를 출력한다.
	 * @param winner 승자
	 */
	public void raceWinner(String winner) {
		System.out.println(format(OUTPUT_RACE_WINNER, winner));
	}
}
