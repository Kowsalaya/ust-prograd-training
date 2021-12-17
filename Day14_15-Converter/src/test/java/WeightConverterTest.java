//day15
//        As an architect I want to be able to check if 1 g is equal to 1 g, and 0.1 kg = 100 g,
//        and to know that 10 g + 1 kg = 1010 g, and 1.5 kg - 500 g = 1 kg.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightConvertorTest {
    private WeightConvertor weightConvertor;

    @BeforeEach
    void setup() {
        weightConvertor = new WeightConvertor();
    }

    @Nested
    class GramToGram {
        @Test
        public void checkOneGramIsEqualToOneGram() {
            double actualWeight = weightConvertor.gramToGram(1);
            double expectedWeight = 1;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    class GramToKiloGram {
        @Test
        public void checkFiveHundredGramIsEqualToPointFiveGram() {
            double actualWeight = weightConvertor.gramToKilogram(500);
            double expectedWeight = 0.5;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    class KilogramToGram {
        @Test
        public void checkFiveHundredGramIsEqualToPointFiveGram() {
            double actualWeight = weightConvertor.gramToKilogram(500);
            double expectedWeight = 0.5;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    class GramToKilogram {
        @Test
        public void checkFiveHundredGramIsEqualToPointFiveGram() {
            double actualWeight = weightConvertor.gramToKilogram(500);
            double expectedWeight = 0.5;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    class AddingWeights {
        @Test
        public void checkAdditionOfOneGramAndOneKilogramIsEqualToThousandTenGram() {
            double actualWeight = 1 + weightConvertor.kilogramToGram(1);
            double expectedWeight = 1010;
            assertEquals(expectedWeight, actualWeight);
        }
    }

    @Nested
    class SubtractingWeights {
        @Test
        public void checkAdditionOfOnePointKilogramAndFiveHundredGramIsEqualToOneKilogram() {
            double actualWeight = 1.5 - weightConvertor.gramToKilogram(500);
            double expectedWeight = 1;
            assertEquals(expectedWeight, actualWeight);
        }
    }
}