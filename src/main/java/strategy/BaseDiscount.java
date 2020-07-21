package strategy;

/**
 * 它是所有具体优惠算法的父类，定义了一个 discount 抽象方法
 * @author qian
 */
public abstract class BaseDiscount {

    protected double finalPrice;

    protected String desc;

    public BaseDiscount() {
    }

    public BaseDiscount(String desc){
        this.desc = desc;
    }

    abstract double discount(double price);

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
