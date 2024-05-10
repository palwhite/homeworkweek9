package javaprogramhw;

import java.util.ArrayList;

public class Question10 {

    public static void main(String[] args) {

        /* 10. Write program and add all group members names in to array and iterates
            through for each loop and print your name.*/

        ArrayList<String> names=new ArrayList<>();
        names.add("Nirali");
        names.add("Minal");
        names.add("Deval");
        names.add("Kinjal");
        names.add("Vaishali");
        names.add("komal");

        System.out.println(names.contains("Nirali"));

        for(String name:names){

            System.out.println(name);

        }
    }
}
