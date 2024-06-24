package org.geunskoo.coordinate;

public class CoordinateNum {

    private final int MAX_COORDINATE_NUMBER = 24;
    private final int MIN_COORDINATE_NUMBER = 0;
    private final String ARGUMENT_ERROR_MESSAGE = "좌표 값은 0과 24사이의 정수 값만 입력 가능합니다.";

    private final int number;

    public CoordinateNum(int number) {
        validateInputValue(number);
        this.number = number;
    }

    private void validateInputValue(int number) {
        if (number < MIN_COORDINATE_NUMBER || number > MAX_COORDINATE_NUMBER){
            throw new IllegalArgumentException(ARGUMENT_ERROR_MESSAGE);
        }
    }

    public int gap(CoordinateNum other) {
        return this.number - other.number;
    }
}
