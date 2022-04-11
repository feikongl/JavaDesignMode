package mode.design.BuilderPattern;

/**
 * @time 2022/4/11 11:21 下午
 * @Author feikong
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
