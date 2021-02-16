package services;

import Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person saveOrUpdatePerson(Person person) {
        return personRepository.saveOrUpdatePerson(person);
    }

    public Person findById(int id) {
        return personRepository.findById(id);
    }
}
