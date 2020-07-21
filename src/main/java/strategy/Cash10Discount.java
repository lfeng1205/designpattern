package strategy;

/**
 * 返现10元
 * @author qian
 */
public class Cash10Discount extends BaseDiscount {

    public Cash10Discount() {
        super("返现10元");
    }

    @Override
    public double discount(double price) {
        this.finalPrice = price >= 10 ? price - 10 : 0;
        return finalPrice;
    }
}
