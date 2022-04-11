package mode.design.BuilderPattern;

/**
 * @time 2022/4/11 11:20 下午
 * @Author feikong
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
