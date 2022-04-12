package mode.design.BridgePattern;

/**
 * @time 2022/4/12 10:22 下午
 * @Author feikong
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
