//element stored in sorting order

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Employee implements Comparable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    public void show() {
        System.out.println(id + " " + name);
    }

    public String toString()
    {
        return this.id + " " + this.name;
    }

}

class Address implements Comparable {
    String cityName;

    Address(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        return this.cityName.compareToIgnoreCase(e.name);
    }

    public void show() {
        System.out.println(cityName);
    }

    public String toString()
    {
        return this.cityName;
    }
}


public class TreeMapDemo {
    public static void main(String[] args) {

        System.out.println("Treemap using Wrapper classes");
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("002", "gaurav");
        tm.put("003", "Singh");
        tm.put("004", "bora");
        tm.put("001", "added");
        tm.put("0abc", "ok");
        System.out.println(tm);


        System.out.println("\n TreeMap using UserDefinedClass");
        Employee e1 = new Employee(123, "Gaurav");
        Employee e2 = new Employee(789, "Singh");
        Employee e3 = new Employee(345, "Bora");
        Employee e4 = new Employee(123, "Okk");

        Address a1 = new Address("Bageshwar");
        Address a2 = new Address("Nainital");
        Address a3 = new Address("bageshwar");
        Address a4 = new Address("Uttarakhand");


        Map<Employee, Address> utm = new TreeMap<>();
        utm.put(e1,a1);
        utm.put(e2,a2);
        utm.put(e3,a3);
        utm.put(e4,a4);

        Set se=utm.entrySet();
        Iterator etr=se.iterator();
        System.out.println("\n ********Entries are ********");
        while(etr.hasNext()){
            System.out.println(etr.next());
        }

    }
}