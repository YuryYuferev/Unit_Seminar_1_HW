package Calculator;

import org.junit.Test;

import java.beans.Beans;

public class Assertions {
    private static Beans Object;

    public static Object assertThat(double actualDiscountedAmount) {
        return actualDiscountedAmount;
    }
    public static Beans assertThatThrownBy(Object o) {
        return Object;
    }

    public static class CalculatorTest {
        private Calculator calculator = new Calculator();

        @Test(expected = ArithmeticException.class)
        public void calculateDiscount_ValidArguments_ReturnsDiscountedAmount() {
            double purchaseAmount = 100.0;
            double discountPercentage = 20.0;
            double expectedDiscountedAmount = 80.0;
            double actualDiscountedAmount = calculator.calculateDiscount(purchaseAmount, discountPercentage);
            assertThat(actualDiscountedAmount).equals(expectedDiscountedAmount);
        }

        @Test(expected = ArithmeticException.class)
        public void calculateDiscount_InvalidArguments_ThrowsArithmeticException() {
            double purchaseAmount = -100.0;
            double discountPercentage = 20.0;
            calculator.calculateDiscount(purchaseAmount, discountPercentage);
        }
    }
}