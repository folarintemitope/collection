package collectionToturial;

import java.util.LinkedList;

public class LInkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("cashew");

        System.out.println("inital linkedlist" + fruits);
        //adding element to a specific position in the linkedlist
        fruits.add(2,"apple");
        System.out.println("after adding apple" + fruits);
        //adding element at the beginning of the first list
        fruits.addFirst("watermelon");
        System.out.println("first element" + fruits);
        //adding element at the end of the linkedlist
        fruits.addLast("cucumber");
        System.out.println("last element" + fruits);
    }
}
