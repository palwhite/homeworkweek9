package javaprogramhw;

import java.util.HashSet;

public class Question6 {

    public static void main(String[] args) {

        /* 6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
            Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
            and if else)*/

        HashSet<Integer> numbers=new HashSet<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(12);
        numbers.add(2);

        for (Integer i:numbers){
            if (i<=10){
                System.out.println(i);
            }else {
                System.out.println(" ");
                System.out.println("Number " + i + " is greatter than 10");
            }
        }

    }
}
