package practic26.model;

public class Student extends Person {
    private  int grade;
    private String schoolName;

    public Student(int id, String name, int age, int grade, String schoolName) {
        super(id, name, age);
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

//    @Override
//    public String toString() {
//        return "Student:"+
//                "grade=" + grade +
//                ", schoolName='" + schoolName + '\'' ;
//    }


    @Override
    public String toString() {
        return "Student:" +
                "grade=" + grade +
                " schoolName=" + schoolName + '\'' +
                " " + super.toString();
    }
}
