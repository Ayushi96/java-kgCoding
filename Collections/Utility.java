package Collections;

import java.util.Collection;

public class Utility {
    //here E is the type -- generics
    public static <E> void printCollection(Collection<E> collection) {
        System.out.println("Collection is ");
        for (E c : collection) {
            System.out.println(c+ " ");
        }

    }
}
