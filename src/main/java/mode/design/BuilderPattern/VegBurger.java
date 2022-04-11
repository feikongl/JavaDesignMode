package mode.design.BuilderPattern;

/**
 * @time 2022/4/11 11:21 下午
 * @Author feikong
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
