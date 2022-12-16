import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee1 {
    int id;
    String name, address;

    public Employee1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void show() {
        System.out.println(id + " " + name+" "+address);
    }

}


public class b_TreeSetDemo_with_Comparator {
    public static void main(String[] args) {

        Comparator nameComparator= new bi_Comparator_NameComp();
        Comparator idComparator= new bi_Comparator_IdComp();
        Comparator addressComparator= new bi_Comparator_AddressComp();

//        there are 3 attributes in Employee class thats why 3 comparators are created, now use that one which gives you required sorting


//      Use Tree Set Modified Constructor that takes a comparator
        TreeSet t1 = new TreeSet(addressComparator);
        t1.add(new Employee1(2, "Singh","Bageshwar"));
        t1.add(new Employee1(1, "Gaurav","Nainital"));
        t1.add(new Employee1(3, "Bora","Uttarakhand"));
        t1.add(new Employee1(2, "Added","Bageshwar"));
        t1.add(new Employee1(4, "Gaurav","Nainital"));


        Iterator it = t1.iterator();
        while (it.hasNext()) {
            Employee1 emp = (Employee1) it.next();
            emp.show();
        }

    }
}
