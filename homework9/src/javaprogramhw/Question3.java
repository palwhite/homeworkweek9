package javaprogramhw;

import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args) {

        /* 3. Write a Java program to create a new array list, add some colours(string) and
            printout the collection using for each loop.*/

        ArrayList<String> colours = new ArrayList<>();
        colours.add("RED");
        colours.add("YELLOW");
        colours.add("BLACK");
        colours.add("WHITE");
        colours.add("ORANGE");

        for(String colors : colours){
            System.out.println(colors);
        }

    }
}
