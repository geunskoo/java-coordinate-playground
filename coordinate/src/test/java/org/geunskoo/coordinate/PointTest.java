package org.geunskoo.coordinate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    @DisplayName("두 점 사이의 거리를 구할 수 있다.")
    void create(){
        Point a = new Point(10, 10);
        Point b = new Point(14, 15);
        Calculator calculator = new Calculator();
        Line line = calculator.drawLine(a,b);

        assertThat(line.getLength()).isEqualTo(6.403, offset(0.00099));
    }

    @Test
    @DisplayName("두 점과 연산을 입력하면 계산기는 거리를 구해준다.")
    void calculate(){
        Calculator calculator = new Calculator();
        Line line = calculator.calcDistance("(10,10)-(14,15)");

        assertThat(line.getLength()).isEqualTo(6.403, offset(0.00099));
    }
}
