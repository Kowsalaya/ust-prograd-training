import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Nested
    class Area {
        @Nested
        class TestAreaOfWhenBothLengthAndBreadthAreNonZero {

            @Test
            public void verifyAreaOfRectangleLengthTwoAndBreadthThree() {
                Rectangle rect = new Rectangle(2, 3);
                double answer = rect.area();
                double expected = 6;
                Assertions.assertEquals(answer, expected);
            }

            @Test
            public void verifyAreaOfRectangleLengthThreeAndBreadthTwo() {
                Rectangle rect = new Rectangle(3, 2);
                double answer = rect.area();
                double expected = 6;
                Assertions.assertEquals(answer, expected);
            }

            @Test
            public void verifyAreaOfRectangleLengthFourAndBreadthTwo() {
                Rectangle rect = new Rectangle(4, 2);
                double answer = rect.area();
                double expected = 8;
                Assertions.assertEquals(answer, expected);
            }
        }

        @Nested
        class TestAreaOfWhenBothLengthIsZeroAndBreadthIsNonZero {

            @Test
            public void verifyAreaOfRectangleLengthZeroAndBreadthThree() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 3);rect.area();});
            }

            @Test
            public void verifyAreaOfRectangleLengthZeroAndBreadthFour() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 4);rect.area();});
            }

            @Test
            public void verifyAreaOfRectangleLengthZeroAndBreadthOne() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 1);rect.area();});
            }
        }

        @Nested
        class TestAreaOfWhenBothLengthIsNonZeroAndBreadthIsZero {

            @Test
            public void verifyAreaOfRectangleLengthThreeAndBreadthZero() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 3);rect.area();});
            }

            @Test
            public void verifyAreaOfRectangleLengthFourAndBreadthZero() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 4);rect.area();});
            }

            @Test
            public void verifyAreaOfRectangleLengthFiveAndBreadthZero() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 1);rect.area();});
            }
        }

        @Nested
        class TestAreaOfWhenBothLengthAndBreadthAreZero {

            @Test
            public void verifyAreaOfRectangleLengthZeroAndBreadthZero() {
                Assertions.assertThrows(IllegalArgumentException.class, () -> {
                    Rectangle rect = new Rectangle(0, 0);rect.area();});
            }
        }
    }
    @Nested
    class Perimeter {
        @Test
        public void verifyPerimeterOfRectangleLengthThreeAndBreadthTwo() {
            Rectangle rect = new Rectangle(2, 3);
            double answer = rect.perimeter();
            double expected = 10;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void verifyPerimeterOfRectangleLengthZeroAndBreadthTwo() {
            Rectangle rect = new Rectangle(0, 2);
            double answer = rect.perimeter();
            double expected = 4;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void verifyPerimeterOfRectangleLengthThreeAndBreadthZero() {
            Rectangle rect = new Rectangle(3, 0);
            double answer = rect.perimeter();
            double expected = 6;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void verifyPerimeterOfRectangleLengthZeroAndBreadthZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle rect=new Rectangle(0,0);rect.perimeter();});
        }
    }
}