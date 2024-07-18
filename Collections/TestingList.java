package Collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Ayushi");
        al.add("Vishwakarma");
        al.add(1, "Manas");

        for(int i = 0; i < al.size(); i++){
            System.out.print(al.get(i));
            System.out.print(" ");
        }
        System.out.println();
        al.remove("Manas");
        System.out.println(al);
    }
}
