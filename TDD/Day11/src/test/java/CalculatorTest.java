import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
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
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void additionOfFourAndSevenIsEleven() {
            double answer = calc.add(4, 7);
            double expected = 11;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void additionOfOneAndZeroIsOne() {
            double answer = calc.add(1, 0);
            double expected = 1;
            Assertions.assertEquals(answer, expected);
        }
    }

    @Nested
    class TestingSubFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }
        @Test
        public void subractionOfSixAndThreeIsThree() {
            double answer=calc.sub(6,3);
            double expected=3;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void subractionOfThreeAndSixIsMinusThree() {
            double answer=calc.sub(3,6);
            double expected=-3;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void subractionOfSixAndZeroIsSix() {
            double answer=calc.sub(6,0);
            double expected=6;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    class TestingMultiplyFunction {
        @BeforeEach
        void setup() {
            calc =new Calculator();
        }
        @Test
        public void multiplitionOfTwoAndTwoisFour() {
            double answer=calc.multiply(2,2);
            double expected=4;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void multiplitionOfTwoAndZeroisZero() {
            double answer=calc.multiply(2,0);
            double expected=0;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void multiplitionOfFourAndTwoisEight() {
            double answer=calc.multiply(4,2);
            double expected=8;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    class TestingDivisionFunction {
        @BeforeEach
        void setup() {
            calc=new Calculator();
        }
        @Test
        public void divisionOfFourAndTwoIsTwo() {
            double answer =calc.div(4,2);
            double expected=2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void divisionOfFourAndZeroThrowsException() {

            Assertions.assertThrows(ArithmeticException.class,()-> {calc.div(4,0);});
        }
    }
}
