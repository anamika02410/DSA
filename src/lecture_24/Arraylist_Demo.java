package lecture_24;
import java.util.ArrayList;

public class Arraylist_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(70);
        System.out.println(list);
        System.out.println(list.size());
        list.add(3,55);
        System.out.println(list);
        System.out.println(list.get(3));
        list.set(3,34);
        System.out.println(list);
    }
}
