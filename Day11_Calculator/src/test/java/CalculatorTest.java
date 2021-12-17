import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Nested
    class TestingAddFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }

        @Test
        public void additionOfTwoAndThreeIsFive() {
            double answer = calc.add(2, 3);
            double expected = 5;
            assertEquals(answer, expected);
        }

        @Test
        public void additionOfFourAndSevenIsEleven() {
            double answer = calc.add(4, 7);
            double expected = 11;
            assertEquals(answer, expected);
        }

        @Test
        public void additionOfOneAndZeroIsOne() {
            double answer = calc.add(1, 0);
            double expected = 1;
            assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingSubFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }

        @Test
        public void subtractionOfSixAndThreeIsThree() {
            double answer = calc.sub(6, 3);
            double expected = 3;
            assertEquals(answer, expected);
        }

        @Test
        public void subtractionOfThreeAndSixIsMinusThree() {
            double answer = calc.sub(3, 6);
            double expected = -3;
            assertEquals(answer, expected);
        }

        @Test
        public void subtractionOfSixAndZeroIsSix() {
            double answer = calc.sub(6, 0);
            double expected = 6;
            assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingMultiplyFunction {
        @BeforeEach
        void setup() {
            calc = new Calculator();
        }

        @Test
        public void multiplicationOfTwoAndTwoIsFour() {
            double answer = calc.multiply(2, 2);
            double expected = 4;
            assertEquals(answer, expected);
        }

        @Test
        public void multiplicationOfTwoAndZeroIsZero() {
            double answer = calc.multiply(2, 0);
            double expected = 0;
            assertEquals(answer, expected);
        }

        @Test
        public void multiplicationOfFourAndTwoIsEight() {
            double answer = calc.multiply(4, 2);
            double expected = 8;
            assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingDivisionFunction {
        @BeforeEach
        void setup() {
            calc = new Calculator();
        }

        @Test
        public void divisionOfFourAndTwoIsTwo() {
            double answer = calc.div(4, 2);
            double expected = 2;
            assertEquals(answer, expected);
        }

        @Test
        public void divisionOfFourAndZeroThrowsException() {
            assertThrows(ArithmeticException.class, () -> {
                calc.div(4, 0);
            });
        }
    }
}
