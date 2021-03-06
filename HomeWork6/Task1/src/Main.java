import Collections.CollectionArray;
import Collections.CollectionLink;
import Collections.CustomCollection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomCollection<Integer> coll = new CollectionArray<>();
        coll.add(5);
        coll.add(6);
        coll.add(7);
        System.out.println(coll.count());
        coll.remove(1);
        Integer el = 5;
        coll.remove(el);
        System.out.println(coll.count());
        coll.clear();
        System.out.println(coll.count());

        CustomCollection<String> coll2 = new CollectionLink<>();
        coll2.add("a");
        coll2.add("b");
        coll2.add("c");
        System.out.println(coll2.count());
        coll2.remove(0);
        System.out.println(coll2.count());
        coll2.clear();
        System.out.println(coll2.count());
    }
}