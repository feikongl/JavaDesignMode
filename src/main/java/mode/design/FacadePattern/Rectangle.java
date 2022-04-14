package mode.design.FacadePattern;

/**
 * @time 2022/4/14 10:53 下午
 * @Author feikong
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
