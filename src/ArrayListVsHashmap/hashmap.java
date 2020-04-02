package ArrayListVsHashmap;
import java.util.HashMap;
//hashmap is a key, value pair

public class hashmap {
    public static void main(String[] args) {
        //created a hashmap object
        HashMap<String, Integer> nameAge = new HashMap<String, Integer>();

        //adding keys and values (name and age)

        nameAge.put("Akash", 25);
        nameAge.put("Sujoy", 23);
        nameAge.put("Adam", 30);
        nameAge.put("Bob", 31);
        nameAge.put("Charlie", 34);
        //printing out all the key value pair from the list
        System.out.println(nameAge);

        //getting the size of the hashmap
        System.out.println(nameAge.size());

        //looping through the map
        for (String i : nameAge.keySet()){
            System.out.println("Name: " + i + "age: " + nameAge.get(i));
        }
    }
}


