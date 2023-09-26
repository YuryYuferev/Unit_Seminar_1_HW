package Calculator;

public class Calculator {

    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount <= 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Недопустимые аргументы");
        }

        double discount = purchaseAmount * (discountPercentage / 100);
        return purchaseAmount - discount;
    }
}
