package javaprogramhw;

import java.util.ArrayList;

public class Question9 {

    public static void main(String[] args) {

        /* 9. Write program and add all group names in to array and iterates through for
                each loop.*/

        ArrayList<String> groupnames=new ArrayList<>();
        groupnames.add("group 1");
        groupnames.add("group 2");
        groupnames.add("group 3");
        groupnames.add("group 4");
        groupnames.add("group 5");

        for(String groupname:groupnames){

            System.out.println(groupname);

        }
    }
}
