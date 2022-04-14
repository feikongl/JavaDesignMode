package mode.design.DecoratorPattern;

/**
 * @time 2022/4/14 8:14 下午
 * @Author feikong
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
