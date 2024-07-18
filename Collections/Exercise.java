package Collections;

import java.util.*;

public class Exercise {

    public static String concat(String... a) {
        StringBuilder sb = new StringBuilder();
        for(String each : a) {
            sb.append(each).append(" ");
        }

        return sb.toString();
    }

    public static void sortString(List li){
        Collections.sort(li, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String t1){
                if(s.equals(t1)) {
                    return 0;
                } else if(s.charAt(0) < t1.charAt(0)){
                    return 1;
                } else {
                    return -1;
                }
            }
        } );
    }

    public static int countFrequency(List <Integer> list, int el){
        return Collections.frequency(list, el);

    }

    public static void swapNumbers(List<Integer> li, int idx1, int idx2){
            Collections.swap(li, idx1, idx2);
    }

    public static void customSwapNumbers(List<Integer> li, int idx1, int idx2) {
        int val1 = li.get(idx1);
        li.set(idx1, li.get(idx2));
        li.set(idx2, val1);
    }

    public static void reverseList(List <Integer> li){
        for(int i = 0; i < li.size()/2; i++){
            swapNumbers(li, i, li.size() - 1 - i);
        }
    }

    public static void findUniqueChar(String str) {
        Map <Character, Integer> letters = new HashMap();
        for(int i = 0; i < str.length(); i ++){
            if(letters.containsKey(str.charAt(i)) ) {
                letters.put(str.charAt(i), letters.get(str.charAt(i)) + 1);
            } else {
                letters.put(str.charAt(i), 1);
            }
        }
       letters.forEach((key, value) -> System.out.println(key + " occurs " + value + " times."));
    }
    public static void main(String[] args) {
        System.out.println(concat("My", "name", "is", "Ayushi."));
        List <String> strList = Arrays.asList("dolly", "ayushi", "tejas", "kanchan");
        System.out.println("list before sorting is " + strList);
        sortString(strList);
        System.out.println("list after sorting is "+ strList);
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 1 , 4, 1);
        System.out.println("Number of times 1 comes in numbers list is " + countFrequency(numbers, 1));
        System.out.println("numbers list before swapping " + numbers);
        swapNumbers(numbers, 2, 3);
        System.out.println("Swapping 2 with 3 in numbers list " + numbers);
        System.out.println("*****Using custom swap*****");
        List <Integer> swapList = Arrays.asList(1, 4, 2, 6, 8, 4, 9, 7);
        System.out.println("numbers list before swapping " + swapList);
        customSwapNumbers(swapList, 2, 3);
        System.out.println("Swapping 2 with 3 in numbers list " + swapList);
        System.out.println("**Reversing the list***");
        System.out.println("list before reverse is " + numbers);
        reverseList(numbers);
        System.out.println("List after reverse is "+ numbers);
        System.out.println("******Map*******");
        findUniqueChar("ayushiVishwakarma");
    }
}
