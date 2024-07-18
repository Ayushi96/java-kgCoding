package Collections;

public class Student {

    String name;
    char grade;

    Student(String name, char grade){
        this.name = name;
        this.grade = grade;
    }

    Student(){
        this.name = "Ayushi";
        this.grade = 'A';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
