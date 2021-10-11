package racinggame;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CarsTest {
	Cars cars;

	@BeforeEach
	void setUp() {
		cars = new Cars(Arrays.asList("pobi","crong","honux"));
	}

	@Test
	@DisplayName("모든 자동차들의 초기 위치는 0이다.")
	void race_init() {
		Map<String, Integer> map = cars.raceStatusMap();

		assertThat(map.containsKey("pobi")).isTrue();
		assertThat(map.containsKey("crong")).isTrue();
		assertThat(map.containsKey("honux")).isTrue();
		assertThat(map.get("pobi")).isEqualTo(0);
		assertThat(map.get("crong")).isEqualTo(0);
		assertThat(map.get("honux")).isEqualTo(0);
	}
}
