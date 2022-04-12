package mode.design.BridgePattern;

/**
 * @time 2022/4/12 10:23 下午
 * @Author feikong
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
