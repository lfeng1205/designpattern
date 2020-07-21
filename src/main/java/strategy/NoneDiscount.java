package strategy;

/**
 * 不参与优惠活动
 * @author qian
 */
public class NoneDiscount extends BaseDiscount {

    public NoneDiscount() {
        super("不参与优惠活动");
    }

    @Override
    double discount(double price) {
        finalPrice = price;
        return finalPrice;
    }
}
