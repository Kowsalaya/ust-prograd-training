import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {
    private Convertor convertor;

    @BeforeEach
    void setup() {
        convertor = new Convertor();
    }

    @Test
    public void checkForOneCentimeterIsEqualToOneCentimeter() {
        double actualMeasurement = convertor.unitConvertor(1, "cm", "cm");
        double expectedMeasurement = 1;
        assertEquals(actualMeasurement, expectedMeasurement);
    }

    @Test
    public void checkForOneMeterIsEqualToHundredCentimeter() {
        double actualMeasurement = convertor.unitConvertor(1, "m", "cm");
        double expectedMeasurement = 100;
        assertEquals(actualMeasurement, expectedMeasurement);
    }

    @Test
    public void checkForHundredCentimeterIsEqualToPointZeroZeroOneKilometer() {
        double actualMeasurement = convertor.unitConvertor(100, "cm", "km");
        double expectedMeasurement = 0.001;
        assertEquals(actualMeasurement, expectedMeasurement);
    }

    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            convertor=new Convertor();
            convertor.unitConvertor(-1, "cm", "cm");
        });
    }

    @Test
    public void throwsExceptionWhenFromUnitIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            convertor=new Convertor();
            convertor.unitConvertor(1, "km", "cm");
        });
    }

    @Test
    public void throwsExceptionWhenToUnitIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            convertor=new Convertor();
            convertor.unitConvertor(1, "cm", "mm");
        });
    }
}