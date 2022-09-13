package practic26.service;

import practic26.dao.DataBase;
import practic26.model.Employee;
import practic26.model.Person;
import practic26.model.Student;

public class PersonServiceImpl implements PersonService {
    private DataBase dataBase;

    public PersonServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }


    @Override
    public void addPerson(Person person) {
       dataBase.getArrayList().add(person);
    }

    @Override
    public void removePersonById(int id) {
        for (int i = 0; i < dataBase.getArrayList().size(); i++) {
            if (dataBase.getArrayList().get(i).getId()==id){
                dataBase.getArrayList().remove(i);
                System.out.println("Removed by id");
                break;
            }
        }

    }

    @Override
    public void removePersonByName(String name) {
        for (int i = 0; i < dataBase.getArrayList().size(); i++) {
            if (dataBase.getArrayList().get(i).getName().equals(name)){
                dataBase.getArrayList().remove(i);
                System.out.println("Removed by name");
                break;
            }

        }

    }

    @Override
    public void findPersonById(int id) {
        for (int i = 0; i < dataBase.getArrayList().size(); i++) {
           if(dataBase.getArrayList().get(i).getId()==id){
               System.out.println(dataBase.getArrayList().get(i));
               break;
           }

        }
        try {
            if(id>5){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.out.println("Id tabylgan jok");
        }

    }

    @Override
    public void gedPersons() {
        for (Person i:dataBase.getArrayList()) {
            System.out.println("Name:"+i.getName());
            System.out.println("Age:"+i.getAge());
            System.out.println("Id:"+i.getId());
            if (i instanceof Student ) {
                System.out.println("Grade:"+((Student) i).getGrade());
                System.out.println("School name:"+((Student)i).getSchoolName());
            }
            if (i instanceof Employee){
                System.out.println(((Employee) i).getSalary());
                System.out.println(((Employee) i).getCompanyName());
            }
            System.out.println("-----------------------");

        }

    }
}
