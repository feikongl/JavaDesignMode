package mode.design.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @time 2022/4/13 11:54 上午
 * @Author feikong
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
