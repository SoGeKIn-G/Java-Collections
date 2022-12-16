//LinkedHashSet -> Insertion Ordering+Unique objects


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h=new LinkedHashSet();
        h.add(5);
        h.add(23);
        h.add(5);
        h.add(56);
        h.add(90);
        System.out.println(h);
        System.out.println(h.isEmpty());
        System.out.println(h.contains(5));
        System.out.println(h.size());
        System.out.println(h.remove(2));
    }
}
