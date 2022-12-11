import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector vector = new Vector();
//      default constructor1->  initial capacity by default = 10 && capacity will double whenever size==capacity
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());

        vector.add(1);
        vector.add("ga");
        vector.addElement(true);
        vector.add(5.9);
        System.out.println("vector"+vector);


//        constructor 2 -> takes initial capacity
Vector vector1=new Vector(8);
        System.out.println(vector1.capacity());
        vector1.add(45);
        vector1.add(4.5);
        vector1.add(28);

        System.out.println("vector1"+vector1);

        ArrayList a=new ArrayList();
        a.add(11);
        a.add(false);
        a.add('g');

//        Constructor 3 -> takes Collection as parameter
        Vector vector2=new Vector(a);
        vector2.add("added");
        System.out.println("vector2"+vector2);

//        Constructor 4 -> takes initial capacity and a integer that increase the capacity of vector when size ==capacity
        Vector vector3=new Vector(4,3);

        vector3.add(22);
        vector3.add(22);
        vector3.add(22);
        vector3.add(22);
        vector3.add(22);
        System.out.println("vector3"+vector3);
        System.out.println(vector3.capacity());
        System.out.println(vector3.size());

//for traversal -> iterator, listIterator, for loop, forEach loop, enumeration
        System.out.println("Enumeration.......................");
        Enumeration enu=vector.elements();
        while (enu.hasMoreElements()){
            System.out.print(enu.nextElement()+" ");
        }
    }
}