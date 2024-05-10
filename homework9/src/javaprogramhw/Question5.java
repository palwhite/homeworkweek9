package javaprogramhw;

import java.util.ArrayList;

public class Question5 {

    public static void main(String[] args) {

        /*5. Write a Java program to test an array list is empty or not. Define array list with
            underground tube names*/

        ArrayList<String>  states= new ArrayList<>();

        if (states.isEmpty()==true){

            System.out.println("Arraylist empty");

            states.add("Gujarat");
            states.add("Rajasthan");
            states.add("Madhya Pradesh");
            states.add("Kerala");
            states.add("Delhi");

            System.out.println("after adding data the arraylist is: ");

            for (String state: states){
                System.out.println(state);
            }
        }
        else {
            for (String state: states){
                System.out.println(state);
            }
        }


    }
}
