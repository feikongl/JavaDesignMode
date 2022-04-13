package mode.design.FilterPattern;

import java.util.List;

/**
 * @time 2022/4/13 11:52 上午
 * @Author feikong
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
