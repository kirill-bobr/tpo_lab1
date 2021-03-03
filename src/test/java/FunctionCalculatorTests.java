import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FunctionCalculatorTests {


    private static FunctionCalculator functionCalculator;
    @BeforeAll
    static void setUp() {
        functionCalculator = new FunctionCalculator();
    }

    @Test
    public void testFunctionCalculating() {

        for (double x = -1; x <= 1; x += 0.01) {
            double y = functionCalculator.calculateArctangent(x);
            System.out.println(y + " " + Math.atan(x));
            Assertions.assertEquals(y, Math.atan(x), 0.002);
        }

    }

    @Test
    public void testIllegalArctanArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->  functionCalculator.calculateArctangent(-1.5) );
    }

}
