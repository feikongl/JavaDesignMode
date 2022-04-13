package mode.design.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @time 2022/4/13 11:53 上午
 * @Author feikong
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
