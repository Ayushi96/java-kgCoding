package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(10);
        numList.add(1);
        numList.add(-9);
        Utility.printCollection(numList);
        Collections.sort(numList);
        Utility.printCollection(numList);
        Collections.reverse(numList);
        Utility.printCollection(numList);


        List<Integer> l = Collections.unmodifiableList(numList);
        // throws exception
//        l.add(4);

    }
}
