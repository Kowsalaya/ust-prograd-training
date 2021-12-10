// 1. As an architect, I want to be able to check if 1 cm is equal to 1 cm, or 1 m is equal to
// 100 cm.
// 2. As an architect, I want to be able to check if 100 cm is equal to 0.001 km.
// 3.As an architect, I want to be able to know that 1 m + 100 cm = 2 m, or 200 cm + 1 km = 100200 cm.
// 4. As an architect, I want to be able to know that 1 m - 50 cm = 0.5 m, 2000 cm – 1 m = 1900 cm.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConvertorTest {
    private LengthConvertor lengthConvertor;

    @BeforeEach
    void setup() {
        lengthConvertor = new LengthConvertor();
    }

    @Nested
    class CentiMeterToCentiMeter {
        @Test
        public void checkOneCentiMeterIsEqualToOneCentimeter() {
            double actualLength = lengthConvertor.centimeterToCentimeter(1);
            double expectedLength = 1;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class MeterToCentimeter {
        @Test
        public void checkOneMeterIsToIsEqualToHundredCentimeter() {
            double actualLength = lengthConvertor.meterToCentimeter(1);
            double expectedLength = 100;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class CentiMeterToKiloMeter {
        @Test
        public void checkOneCentimeterIsEqualToPointZeroZeroKilometer() {
            double actualMagnitude = lengthConvertor.centimeterToKilometer(1);
            double expectedMagnitude = 0.001;
            assertEquals(expectedMagnitude, actualMagnitude);
        }
    }

    @Nested
    class AddingMagnitude {
        @Test
        public void checkAdditionOfOneMeterAndOneCentimeterIsEqualToTwoMeter() {
            double actualMagnitude = 1 + lengthConvertor.centimeterToMeter(100);
            double expectedMagnitude = 2;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkAdditionOfTwoHundredCentimeterAndOneKilometerIsEqualToOneLakhAndTwoHundredCentimeter() {
            double actualMagnitude = 200 + lengthConvertor.kilometerToCentiMeter(1);
            double expectedMagnitude = 100200;
            assertEquals(expectedMagnitude, actualMagnitude);
        }
    }

    @Nested
    class SubtractingMagnitude {
        @Test
        public void checkSubtractionOfOneMeterAndFiftyCentimeterIsEqualToPointFiveMeter() {
            double actualMagnitude = 1 - lengthConvertor.centimeterToMeter(50);
            double expectedMagnitude = 0.5;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkSubtractionOfTwoThousandCentimeterAndOneMeterIsEqualToThousandNineHundredCentimeter() {
            double actualMagnitude = 2000 - lengthConvertor.meterToCentimeter(1);
            double expectedMagnitude = 1900;
            assertEquals(expectedMagnitude, actualMagnitude);
        }
    }
}





/*

class LengthConvertorTest {
    private LengthConvertor lengthConvertor;

    @BeforeEach
    void setup() {
        lengthConvertor = new LengthConvertor();
    }

    @Test
    public void checkForOneCentimeterIsEqualToOneCentimeter() {
        double actualMeasurement = lengthConvertor.unitConvertor(1, "cm", "cm");
        double expectedMeasurement = 1;
        assertEquals(actualMeasurement, expectedMeasurement);
    }

    @Test
    public void checkForOneMeterIsEqualToHundredCentimeter() {
        double actualMeasurement = lengthConvertor.unitConvertor(1, "m", "cm");
        double expectedMeasurement = 100;
        assertEquals(actualMeasurement, expectedMeasurement);
    }

    @Test
    public void checkForHundredCentimeterIsEqualToPointZeroZeroOneKilometer() {
        double actualMeasurement = lengthConvertor.unitConvertor(100, "cm", "km");
        double expectedMeasurement = 0.001;
        assertEquals(actualMeasurement, expectedMeasurement);
    }

    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConvertor=new LengthConvertor();
            lengthConvertor.unitConvertor(-1, "cm", "cm");
        });
    }

    @Test
    public void throwsExceptionWhenFromUnitIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConvertor=new LengthConvertor();
            lengthConvertor.unitConvertor(1, "km", "cm");
        });
    }

    @Test
    public void throwsExceptionWhenToUnitIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConvertor=new LengthConvertor();
            lengthConvertor.unitConvertor(1, "cm", "mm");
        });
    }
}

 */