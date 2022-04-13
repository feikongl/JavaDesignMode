package mode.design.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @time 2022/4/13 11:54 上午
 * @Author feikong
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
