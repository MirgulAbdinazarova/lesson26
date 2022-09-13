package practic26.model;

public class Employee extends Person{
    private  int salary;
    private String companyName;

    public Employee(int id, String name, int age, int salary, String companyName) {
        super(id, name, age);
        this.salary = salary;
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "salary=" + salary +
                " companyName=" + companyName + '\'' +
                ", " + super.toString();
    }
}
