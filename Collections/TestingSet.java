package Collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Ayushi"));
        names.add("Dolly");
        Utility.printCollection(names);
        System.out.println(names.add("Ayushi"));
        System.out.println(names.contains("Ayushi"));
        System.out.println(names.remove("Ayushi"));
        Utility.printCollection(names);
    }
}
