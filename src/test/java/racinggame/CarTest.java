package racinggame;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car("tobi");
	}

	@Test
	@DisplayName("4 이상일 경우 전진할 수 있는 상태이다.")
	void car_status_go() {
		MoveStatus status = car.canMove(4);
		assertThat(status.isGo()).isTrue();
	}

	@Test
	@DisplayName("3 이하일 경우 멈춘다.")
	void car_status_stop() {
		MoveStatus status = car.canMove(3);
		assertThat(status.isStop()).isTrue();
	}

	@Test
	@DisplayName("자동차가 전진할 수 있는 상태이면 1칸 이동한다.")
	void car_move_go() {
		MoveStatus status = car.canMove(4);
		CarPosition carPosition = car.move(status);
		assertThat(carPosition.getPosition()).isEqualTo(1);
	}

	@Test
	@DisplayName("자동차가 전진할 수 없는 상태이면 이동하지 않는다.")
	void car_move_stop() {
		MoveStatus status = car.canMove(3);
		CarPosition carPosition = car.move(status);
		assertThat(carPosition.getPosition()).isEqualTo(0);
	}
}
