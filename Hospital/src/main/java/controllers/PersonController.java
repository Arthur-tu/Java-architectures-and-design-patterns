package controllers;

import Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.PersonService;

import java.util.List;

// root: http://localhost:8189/app/students

@Controller
@RequestMapping("/persons")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String showAllPersons(Model model) {
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        return "all_persons";
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_person_form";
    }

    // public String saveNewStudent(@RequestParam Long id, @RequestParam String name, @RequestParam int score) {
    @PostMapping("/add")
    public String saveNewPerson(@ModelAttribute Person newPerson) {
        personService.saveOrUpdatePerson(newPerson);
        return "redirect:/persons/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("person", personService.findById(id));
        return "edit_person_form";
    }

    @PostMapping("/edit")
    public String modifyPerson(@ModelAttribute Person modifiedPerson) {
        personService.saveOrUpdatePerson(modifiedPerson);
        return "redirect:/students/";
    }

    @GetMapping("/json/{id}")
    @ResponseBody
    public Person showJsonPerson(@PathVariable int id) {
        return personService.findById(id);
    }
}
