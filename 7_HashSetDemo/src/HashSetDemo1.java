import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
//hashmap internally creates a hashtable
        Set h=new HashSet();
        h.add(12);
        h.add(2);
        h.add(82);
        h.add(19);
        h.add(52);
        h.add(2);
        h.add(12);

        System.out.println(h);

    }
}
