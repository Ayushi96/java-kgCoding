public class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details: { name: " +name+ ", age: " +age+ "  , roll number: " + rollNumber+  ", house: " +house +"}";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Ayushi", 28, "13cs13", "peace");
        System.out.println(stu);
        String firstname = "Ayushi";
        String lastName = "Vishwakarma";
        String fullName = firstname + " " + lastName;
        System.out.println("fullname is " + fullName);
        String fullName1 = firstname.concat(" ").concat(lastName);
        System.out.println("full name using concat method is "+ fullName1);
    }
}
