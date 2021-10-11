package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racinggame.CarName;

public class ValidationTest {
	@Test
	@DisplayName("자동차 이름이 빈 값이거나 null 일 경우 오류를 반환한다.")
	void car_name_empty_valid() {
		Assertions.assertThatThrownBy(() -> new CarName(""))
			.isInstanceOf(IllegalArgumentException.class);
		Assertions.assertThatThrownBy(() -> new CarName(null))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("자동차 이름이 5자리가 넘어갈 경우 오류를 반환한다.")
	void car_name_6_length_valid() {
		Assertions.assertThatThrownBy(() -> new CarName("6자리차이름"))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
