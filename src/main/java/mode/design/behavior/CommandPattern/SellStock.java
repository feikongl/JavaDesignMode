package mode.design.behavior.CommandPattern;

/**
 * @time 2022/4/18 10:52 下午
 * @Author feikong
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
