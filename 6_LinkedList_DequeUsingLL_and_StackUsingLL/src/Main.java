import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){

//        Linked List Collection creates a Doubly LinkedList
        LinkedList linkedList=new LinkedList();
        System.out.println(linkedList);
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");

        System.out.println("Traversal using iterator");

        Iterator it=linkedList.iterator();
        while(it.hasNext()){
            Object o=(Object)it.next();
            System.out.print(o+" ");
        }
        System.out.println();

        System.out.println("Traversal by listIterator");

        ListIterator litr= linkedList.listIterator();
        while(litr.hasPrevious()){
            Object o=(Object)litr.previous();
            System.out.print(o+" ");
        }

        System.out.println("existence of one :"+ linkedList.contains("one"));


        System.out.println("Linked List as Deque");
        LinkedList lq =new LinkedList();
        lq.add("five");
        lq.add("six");
        lq.add("seven");
        System.out.println(lq);
        lq.addFirst("first");

        lq.add(2,"added");
        lq.addLast("last");

        System.out.println(lq);
        System.out.println(lq.getFirst());
        System.out.println(lq.getLast());
        lq.removeFirst();
        lq.removeLast();
        System.out.println(lq);


        System.out.println("LinkedList as a Stack");

        LinkedList ls=new LinkedList();
        ls.push("one");
        ls.push("two");
        ls.push("three");
        ls.push("four");

        System.out.println(ls.pop());
        System.out.println(ls.pop());
        System.out.println(ls.peek());

        System.out.println(ls);




    }
}