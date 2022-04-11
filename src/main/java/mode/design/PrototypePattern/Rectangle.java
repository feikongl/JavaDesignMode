package mode.design.PrototypePattern;

/**
 * @time 2022/4/11 11:41 下午
 * @Author feikong
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
