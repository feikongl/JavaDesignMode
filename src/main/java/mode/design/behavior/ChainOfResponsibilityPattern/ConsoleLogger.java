package mode.design.behavior.ChainOfResponsibilityPattern;

/**
 * @time 2022/4/18 7:53 下午
 * @Author feikong
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
