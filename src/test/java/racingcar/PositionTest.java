package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {
    @Test
    void compareTest() {
        Position position1 = new Position();
        Position position2 = new Position();
        position1.proceed();
        Assertions.assertThat(position1.compareTo(position2)).isEqualTo(1);
    }
}