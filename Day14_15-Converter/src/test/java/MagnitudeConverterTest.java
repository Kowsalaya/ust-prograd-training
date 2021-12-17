
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagnitudeConverterTest {
    MagnitudeConvertor magnitudeConvertor=new MagnitudeConvertor();

    @Nested
    public class TestWeightMeasurements {
        @Nested
        public class TestDifferentWeights {
            @Test
            public void checkIfOneGramIsEqualToOneGram() {
                double actualValue = magnitudeConvertor.baseToBase(1);
                double expectedValue = 1;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkIfZerPointOneKilogramIsEqualToOneHundredGram() {
                double actualValue = magnitudeConvertor.kiloToBase(0.1);
                double expectedValue = 100;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkAdditionOfTenGramAndOneKilogramIsThousandAndTenGrams() {
                double actualValue = 10 + magnitudeConvertor.kiloToBase(1);
                double expectedValue = 1010;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkSubtractionOfOnePointFiveKilogramAndFiveHundredGramIsOneKilogram() {
                double actualValue = 1.5 - magnitudeConvertor.baseToKilo(500);
                double expectedValue = 1;
                assertEquals(expectedValue, actualValue);
            }
        }
    }

    @Nested
    public class TestLengthMeasurements {
        @Nested
        public class TestDifferentLengths {
            @Test
            public void TestingOneCentimeterIsEqualToOneCentimeter() {
                double actualValue =magnitudeConvertor.centiToCenti(1);
                double expectedValue = 1;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void TestingOneMeterIsEqualToOneCentimeter() {
                double actualValue = magnitudeConvertor.baseToCenti(1);
                double expectedValue = 100;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void TestingOneHundredCmIsEqualToZeroPointZeroZeroOneKilometers() {
                double actualValue = magnitudeConvertor.centiToKilo(100);
                double expectedValue = 0.001;
                assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        public class AddingLengths {
            @Test
            public void checkAdditionOfOneMeterAndOneHundredCentimetersIsTwoMeters() {
                double actualValue = 1 + magnitudeConvertor.centiToBase(100);
                double expectedValue = 2;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkAdditionOfTwoHundredCentimeterAndOneKilometerIsOneLakhTwoHundredCentimeter() {
                double actualValue = 200 + magnitudeConvertor.kiloToCenti(1);
                double expectedValue = 100200;
                assertEquals(expectedValue, actualValue);
            }
        }

        @Nested
        public class SubtractingLengths {
            @Test
            public void checkSubtractionOfOneMeterAndFiftyCentimetersIsZeroPointFiveMeters() {
                double actualValue = 1 -magnitudeConvertor.centiToBase(50);
                double expectedValue = 0.5;
                assertEquals(expectedValue, actualValue);
            }

            @Test
            public void checkSubtractionOfTwoThousandCentimeterAndOneMeterIsNineteenHundredCentimeter() {
                double actualValue = 2000 - magnitudeConvertor.baseToCenti(1);
                double expectedValue = 1900;
                assertEquals(expectedValue, actualValue);
            }
        }
    }
}