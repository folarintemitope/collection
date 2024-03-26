package collectionToturial;

import java.util.LinkedList;

public class RetrievingElementInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("cashew");

        //getting First Element in the LinkedList
        String firstElement = fruits.getFirst();
        System.out.println("firstElement" + firstElement);

        //getting last element in the LinkedList
        String lastElement = fruits.getLast();
        System.out.println("lastElement" + lastElement);

        //getting element at a given position in the linkedList
        String element = fruits.get(1);
        System.out.println("element" + element);

        for(String elements : fruits){
            System.out.println(elements);
        }
    }
}
