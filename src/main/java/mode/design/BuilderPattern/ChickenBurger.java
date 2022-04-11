package mode.design.BuilderPattern;

/**
 * @time 2022/4/11 11:21 下午
 * @Author feikong
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}