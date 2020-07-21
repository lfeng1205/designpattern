package strategy;

import java.text.MessageFormat;

/**
 *环境类 Shopping，维护了一个 BaseDiscount 引用
 * @author qian
 */
public class Shopping {

    private String goods;
    private double price;
    private BaseDiscount discount;

    public Shopping(String goods, double price, BaseDiscount discount) {
        this.goods = goods;
        this.price = price;
        this.discount = discount;
    }

    /**
     * 计算商品价格
     * @return
     */
    public double calculate(){
        double finalPrice = discount.discount(this.price);
        String desc = discount.getDesc();
        System.out.println(MessageFormat.format("购买的物品：{0}，原始价格：{1}，{2}，最终价格为：{3}", goods, price, desc, finalPrice));
        return finalPrice;
    }
}
