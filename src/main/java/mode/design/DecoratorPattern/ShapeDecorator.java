package mode.design.DecoratorPattern;

/**
 * @time 2022/4/14 8:15 下午
 * @Author feikong
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
