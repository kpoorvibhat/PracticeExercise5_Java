package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UpdateArray {

    private List<String> fruits = new ArrayList<>();

    //This method demonstrates updating the array list elements by given elements

    public List<String> updateArrayList(){
        fruits.clear();
        //creating array list of fruits
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");

        //updating certain elements by new elements
        fruits.set(0, "Kiwi");
        fruits.set(2, "Mango");

        //return the updated array list
        return fruits;
    }
    public List<String> removeElements(){

        fruits.clear();
          //creating array list of fruits
          fruits.add("Apple");
          fruits.add("Grape");
          fruits.add("Melon");
          fruits.add("Berry");

          //removing all elements of the array list
          fruits.remove(3);
          fruits.remove(2);
          fruits.remove(1);
          fruits.remove(0);

        return fruits;
    }
}
