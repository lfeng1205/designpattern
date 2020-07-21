package strategy;

/**
 * 打九折
 * @author qian
 */
public class Dis9Discount extends BaseDiscount {

    public Dis9Discount() {
        super("打九折");
    }

    @Override
    double discount(double price) {
        finalPrice = price * 0.9;
        return finalPrice;
    }
}
