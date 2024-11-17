package Lecture15;
import java.util.ArrayList;
import java.util.Collections;

public class LearnArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        list.add(1, 30);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(2);
        Collections.sort(list);
        System.out.println(list);
    }

}
