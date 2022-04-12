package mode.design.BridgePattern;

/**
 * @time 2022/4/12 10:23 下午
 * @Author feikong
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
