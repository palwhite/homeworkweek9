package javaprogramhw;

import java.util.ArrayList;

public class Question11 {

    ArrayList<String> nirali=new ArrayList<>();

    public static void main(String[] args) {

    /* 11. Declare global variables of your name, Add all your group names in list, using
        for each loop iterate and print ONLY your name.*/

        Question11 q11=new Question11();
        q11.nirali.add("Nirali");
        q11.nirali.add("Minal");
        q11.nirali.add("Deval");
        q11.nirali.add("Komal");
        q11.nirali.add("Vaishali");

        System.out.println(q11.nirali.get(0));
    }
}
