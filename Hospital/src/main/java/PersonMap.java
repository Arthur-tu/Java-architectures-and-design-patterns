import Entity.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    private Map<Long,Person> personMap = new HashMap();

    public static void addPerson(Person person) {
        instance.personMap.put(person.getId(), person);
    }

    public static Person getPerson(Long key) {
        return instance.personMap.get(key);
    }

}
