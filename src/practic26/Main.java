package practic26;

import practic26.dao.DataBase;
import practic26.model.Employee;
import practic26.model.Student;
import practic26.service.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {


        Student student1=new Student(1,"Asel",19,5,"Kelechek");
        Student student2=new Student(2,"Dastan",18,4,"DTRE");
        Employee employee1=new Employee(3,"Sadyk",35,800,"Shoro");
        Employee employee2=new Employee(4,"Chynar",36,900,"Shoro");
        Employee employee3=new Employee(5,"Sardar",30,500,"Shoro");
        DataBase dataBase=new DataBase();
        PersonServiceImpl personService=new PersonServiceImpl(dataBase);
         personService.addPerson(student1);
         personService.addPerson(student2);
         personService.addPerson(employee1);
         personService.addPerson(employee2);
         personService.addPerson(employee3);
         personService.findPersonById(8);
         personService.removePersonById(4);
         personService.removePersonByName("Sadyk");
         personService.gedPersons();




    }
}
