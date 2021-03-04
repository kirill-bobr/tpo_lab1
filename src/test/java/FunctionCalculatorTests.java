import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FunctionCalculatorTests {


    private static FunctionCalculator functionCalculator;
    private final double delta = 0.002;

    @BeforeAll
    static void setUp() {
        functionCalculator = new FunctionCalculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/neg_values.csv")
    public void testNegativeValues(double value) {
        Assertions.assertEquals(Math.atan(value), functionCalculator.calculateArctangent(value), delta);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/pos_values.csv")
    public void testPositiveValues(double value) {
        Assertions.assertEquals(Math.atan(value), functionCalculator.calculateArctangent(value), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, 0, 1})
    public void testBoundaryValues(double value) {
        Assertions.assertEquals(Math.atan(value), functionCalculator.calculateArctangent(value), delta);
    }

    @Test
    public void testIllegalArctanArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->  functionCalculator.calculateArctangent(-1.5) );
    }

}
