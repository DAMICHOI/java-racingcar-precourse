package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import racinggame.domain.Cars;
import racinggame.domain.MoveStatus;

public class CarsTest {
	Cars cars;

	@BeforeEach
	void setUp() {
		cars = new Cars("pobi,crong,honux");
	}

	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	@DisplayName("자동차들의 이름이 pobi, crong, honux 로 초기화된다.")
	void race_init_cars_name(String carName) {
		Map<String, Integer> map = cars.raceStatusMap();
		assertThat(map.containsKey(carName)).isTrue();
	}

	@ParameterizedTest
	@ValueSource(strings = {"pobi", "crong", "honux"})
	@DisplayName("모든 자동차들의 초기 위치는 0이다.")
	void race_init_cars_position(String carName) {
		Map<String, Integer> map = cars.raceStatusMap();
		assertThat(map.get(carName)).isEqualTo(0);
	}

	@ParameterizedTest
	@CsvSource(value = {"0:GO:pobi:1", "1:STOP:crong:0", "2:GO:honux:1"}, delimiter = ':')
	@DisplayName("자동차들의 이동 상태에 따라 위치를 확인한다. pobi, honux은 GO 상태이므로 위치가 1, crong은 STOP 상태이므로 위치가 0이다.")
	void race_cars_position_by_move_status(int index, String moveStatus, String carName, int position) {
		cars.get(index).move(getMoveStatus(moveStatus));
		Map<String, Integer> map = cars.raceStatusMap();
		assertThat(map.get(carName)).isEqualTo(position);
	}

	private MoveStatus getMoveStatus(String moveStatus) {
		return moveStatus.equals("GO") ? MoveStatus.GO : MoveStatus.STOP;
	}

	@Test
	@DisplayName("레이싱 게임의 승자는 pobi, honux이다.")
	void race_winner() {
		cars.get(0).move(MoveStatus.GO);
		cars.get(1).move(MoveStatus.STOP);
		cars.get(2).move(MoveStatus.GO);
		assertThat(cars.raceWinner()).isEqualTo("pobi,honux");
	}
}
