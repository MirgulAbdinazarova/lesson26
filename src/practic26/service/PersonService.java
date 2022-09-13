package practic26.service;

import practic26.model.Person;

public interface PersonService {

     void addPerson(Person person);

    void removePersonById(int id);

    void  removePersonByName(String name);

    void findPersonById(int id);

    void gedPersons();
}
