package Calculator;

import Calculator.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountWithValidArguments() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateDiscount(100, 20);
        Assertions.assertThat(result).isEqualTo(80);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithInvalidArguments() {
        Calculator calculator = new Calculator();
        calculator.calculateDiscount(0, 50);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithInvalidDiscountPercentage() {
        Calculator calculator = new Calculator();
        calculator.calculateDiscount(100, -10);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithInvalidDiscountPercentage2() {
        Calculator calculator = new Calculator();
        calculator.calculateDiscount(100, 150);
    }
}
