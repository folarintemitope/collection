package collectionToturial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(10);
        Collections.sort(list);//ascending order
        System.out.println(list);
        Collections.reverse(list);//descending order
        System.out.println(list);

    }
}
