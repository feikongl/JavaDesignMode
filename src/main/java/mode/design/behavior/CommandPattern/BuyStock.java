package mode.design.behavior.CommandPattern;

/**
 * @time 2022/4/18 10:52 下午
 * @Author feikong
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}