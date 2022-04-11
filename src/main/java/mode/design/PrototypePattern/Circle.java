package mode.design.PrototypePattern;

/**
 * @time 2022/4/11 11:41 下午
 * @Author feikong
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
