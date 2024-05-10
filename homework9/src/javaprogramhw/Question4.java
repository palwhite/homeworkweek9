package javaprogramhw;

import java.util.ArrayList;
import java.util.Iterator;

public class Question4 {

    public static void main(String[] args) {

        /* 4. Write a Java program to iterate through all elements in an array list using
            Iterator.*/

        ArrayList<String> names=new ArrayList<>();
        names.add("Nirali");
        names.add("Minal");
        names.add("Deval");
        names.add("Kinjal");
        names.add("Vaishali");
        names.add("komal");

        Iterator<String> i= names.iterator();

        System.out.println(i.next());

        while (i.hasNext()){
            System.out.println(i.next());
        }

//        for(String name:names){
//
//            System.out.println(name);
//
//        }


    }
}
