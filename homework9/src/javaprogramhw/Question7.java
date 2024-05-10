package javaprogramhw;

import java.util.HashMap;

public class Question7 {

    public static void main(String[] args) {

        /*7. Create a HashMap object called people that will store String keys and Integer
            values: And use for each loop to iterate the value from Map.*/

        HashMap<String,Integer> data=new HashMap<>();
        data.put("data1",1);
        data.put("data2",2);
        data.put("data3",3);
        data.put("data4",4);
        data.put("data5",5);

        for (String s : data.keySet()){
            System.out.println(s);
        }

        System.out.println("---------------------------");

        for (Integer i : data.values()){
            System.out.println(i);
        }

        System.out.println("----------------------------");

        for (Object o: data.entrySet()){
            System.out.println(o);
        }

    }
}
