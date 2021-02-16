package repositories;

import Entity.Person;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class PersonRepository {
    private List<Person> personList;
    private int maxId;

    @PostConstruct
    public void init() {
        this.personList = new ArrayList<>();
        this.personList.add(new Person(1,"person" , "test"));
        this.personList.add(new Person(2, "John", "fef"));
        this.maxId = 2;
    }

    public List<Person> findAll() {
        return Collections.unmodifiableList(personList);
    }

    public Person saveOrUpdatePerson(Person person) {
        if (person.getId() == 0) {
            maxId++;
            person.setIdPerson(maxId);
            personList.add(person);
            return person;
        } else {
            for (int i = 0; i < personList.size(); i++) {
                if (personList.get(i).getId() == (person.getId())) {
                   personList.set(i, person);
                    return person;
                }
            }
        }
        throw new RuntimeException("What???");
    }

    public Person findById(int id) {
        for (Person s : personList) {
            if (s.getId() == id) return s;
        }
        throw new RuntimeException("Person not found");
    }
}
