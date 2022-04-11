package mode.design.BuilderPattern;

/**
 * @time 2022/4/11 11:22 下午
 * @Author feikong
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
