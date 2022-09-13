package practic26.dao;

import practic26.model.Person;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Person>arrayList=new ArrayList<>();

    public DataBase(ArrayList<Person> arrayList) {
        this.arrayList = arrayList;
    }

    public DataBase() {
    }

    public ArrayList<Person> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Person> arrayList) {
        this.arrayList = arrayList;
    }
}
