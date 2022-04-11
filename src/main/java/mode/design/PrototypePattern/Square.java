package mode.design.PrototypePattern;

/**
 * @time 2022/4/11 11:41 下午
 * @Author feikong
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
