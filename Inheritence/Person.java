import java.util.Objects;

public class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  Person)){
            return false;
        }
        Person person = new Person();
        if(person.name == name && person.age == age){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
