import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {
    public static void main(String[] args) {

//      3 constructors == 1-> normal constructor  initial capacity is 10 and capacity will increase by 50%  whenever size==capacity
        ArrayList arrayList = new ArrayList();  // Non genric type

        System.out.println(arrayList);// []
        arrayList.add(45);
        arrayList.add(true);
        arrayList.add(4.7);
        arrayList.add("gaurav");
        System.out.println(arrayList);

//        2nd constructor-> take initial capacity
        ArrayList arrayList1 = new ArrayList(2);
//        3rd constructor-> take a collection and add that into it.
        ArrayList arrayList2 = new ArrayList(arrayList);

        arrayList2.add("bora");
        arrayList2.add("ok");
        System.out.println(arrayList2);

        arrayList2.set(1, false);
        arrayList2.set(2, true);
        System.out.println(arrayList2.get(4));
        System.out.println(arrayList2.contains("bora"));
        System.out.println("current size " + arrayList2.size());
        System.out.println(arrayList2.isEmpty());


//        traversal -> 3 types
//     1->   normal for loop
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i) + "  ");
        }
        System.out.println();
//      2->  forEach loop
        for (Object object : arrayList2) {
            System.out.print(object + "  ");
        }
        System.out.println();
//      3->  using iterator
        Iterator<Object> it = arrayList2.iterator();
        while (it.hasNext()) {
            Object object = (Object) it.next(); // if the collection will be generic type than there is no need to type convert it.
            System.out.print(object + "  ");
        }
        System.out.println();

//        retainAll() ->  will keep common objects
//        removeAll() ->will remove the common objects and keep the uncommon objects in collection

        arrayList2.retainAll(arrayList);
        System.out.println(arrayList2);

        arrayList2.removeAll(arrayList);
        System.out.println(arrayList2);

//        create generic type ArrayList
        ArrayList <String>arrayList3=new ArrayList<>();//now this list will only contain string objects

    }
}
