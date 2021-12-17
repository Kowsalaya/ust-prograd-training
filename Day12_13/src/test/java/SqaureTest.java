import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SquareTest {
    Square square;

    @Nested
    class TestingAreaOfSquare {
        @Test
        public void checkAreaOfSquareWhenLengthIsFive() {
            square = new Square(5);
            double actualArea = square.area();
            double expectedArea = 25;
            Assertions.assertEquals(actualArea, expectedArea);

        }

        @Test
        public void checkAreaOfSquareWhenLengthIsTwo() {
            square = new Square(2);
            double actualArea = square.area();
            double expectedArea = 4;
            Assertions.assertEquals(actualArea, expectedArea);

        }

        @Test
        public void checkAreaOfSquareWhenLengthIsMinusTwo() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                square = new Square(0);
                square.area();
            });
        }

        @Test
        public void checkAreaOfSquareWhenLengthIsZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                square = new Square(0);
                square.area();
            });
        }
    }

    @Nested
    class TestingPerimeterOfSquare {
        @Test
        public void checkPerimeterOfSquareWhenLengthIsFive() {
            square = new Square(5);
            double actualArea = square.perimeter();
            double expectedArea = 20;
            Assertions.assertEquals(actualArea, expectedArea);

        }

        @Test
        public void checkPerimeterOfSquareWhenLengthIsTwo() {
            square = new Square(2);
            double actualArea = square.perimeter();
            double expectedArea = 8;
            Assertions.assertEquals(actualArea, expectedArea);

        }

        @Test
        public void checkPerimeterOfSquareWhenLengthIsMinusTwo() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                square = new Square(0);
                square.perimeter();
            });
        }

        @Test
        public void checkPerimeterOfSquareWhenLengthIsZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                square = new Square(0);
                square.perimeter();
            });
        }
    }
}
