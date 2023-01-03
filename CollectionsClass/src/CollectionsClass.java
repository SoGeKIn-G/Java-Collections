import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("two");
        al.add("four");
        System.out.println(al);

        Collections.reverse(al);
        System.out.println("After Reversed :"+al);

        Collections.shuffle(al);
        System.out.println("After Shuffle :"+al);

        Collections.sort(al);
        System.out.println("After Sorting :"+al);

        System.out.println("Min :"+Collections.min(al));
        System.out.println("Max :"+Collections.max(al));

        Collections.addAll(al, "Fruits", "Bat", "Ball");

        Iterator it=al.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

//        binary search
        System.out.println(
                "The index of value three is "
                        + Collections.binarySearch(al, "three"));

//        copy
        List destinationList = new ArrayList<>();
        Collections.copy(destinationList,al);

        for (int i = 0; i < destinationList.size(); i++) {
            System.out.print(destinationList.get(i) + " ");
        }
    }
}