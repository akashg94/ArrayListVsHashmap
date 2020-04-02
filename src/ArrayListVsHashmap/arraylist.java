package ArrayListVsHashmap;
import java.util.ArrayList; //importing arraylist class


public class arraylist {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<String>(); //create an arraylist

        //adding car names
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");
        cars.add("Mazda");
        cars.add("Range Rover");
        //printing the cars names that added
        System.out.println(cars);
        //getting an element form the list
        System.out.println(cars.get(2));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        //using for loop to access the data from the list
        for (int i = 0; i < cars.size(); i ++){
            System.out.println(cars.get(i));
        }
        System.out.println(">>>>>This is for each loop>>>>>");
        //using for each loop to access the data
        for (String i : cars){
            System.out.println(i);
        }


    }
}

