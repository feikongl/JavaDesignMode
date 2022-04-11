package mode.design.BuilderPattern;

/**
 * @time 2022/4/11 11:22 下午
 * @Author feikong
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
