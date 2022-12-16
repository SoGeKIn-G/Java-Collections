// sorted set

import java.util.Iterator;
import java.util.TreeSet;


class Employee implements Comparable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(id + " " + name);
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        if (this.id > e.id) {
            return 1;
        } else if (this.id < e.id) {
            return -1;
        }
        return 0;
    }
//    sorting and duplicate with respect to Name
//    public int compareTo(Object o) {
//        Employee e = (Employee) o;
//       return this.name.compareToIgnoreCase(e.name);
//    }
}

public class a_TreeSetDemo_with_Comparable {
    public static void main(String[] args) {

        TreeSet t = new TreeSet<>();
        t.add(45);
        t.add(1);
        t.add(6);
        t.add(1);
        System.out.println(t.contains(5));
        System.out.println(t.contains(6));
        System.out.println(t.size());
//        t.add("hello"); //will give error because in tree set object should be comparable type + should have same type of object
        System.out.println(t);

        TreeSet t1 = new TreeSet();
        t1.add(new Employee(2, "Singh"));
        t1.add(new Employee(1, "Gaurav"));
        t1.add(new Employee(3, "Bora"));
        t1.add(new Employee(2, "Added"));

        Iterator it = t1.iterator();
        while (it.hasNext()) {
            Employee emp = (Employee) it.next();
            emp.show();
        }
// sorted base on toCompare() method

    }
}



// the problem with Comparable is that if you have user class data than your tree set data will only be affected (duplicate + sorting) by a single attribute of user class (that is used in compareTo() method)
//in uppr example in case of name attribute when used in compareTo() , it takes duplicate id,s
// solution-> Comparator