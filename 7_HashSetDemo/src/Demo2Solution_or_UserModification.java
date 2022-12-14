//For updating the Rules you have to override some methods
//toString()  ,   hashCode(),  equals() method

//you will modify these methods based on your choice than you will see the results according to that

//HashSet -> No ordering + unique values(objects)

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee1 {
    int id;
    String name, address;

    Employee1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void show() {
        System.out.println(id+" "+name+" "+address);
    }

    //    hashCode() method
    public int hashCode(){
        return id*10;
    }

    //    equals() method , we have modified the equals() method now objects are compared based on the id of Employee in the Set Colection
    @Override
    public boolean equals(Object obj) {
        Employee1 e=(Employee1) obj;
        if(this.id==e.id){
            return true;
        }
        else
            return false;
//        return super.equals(obj);
    }

    public String toString(){
        return id+" "+name+" "+address;
    }
}


public class Demo2Solution_or_UserModification {
    public static void main(String[] args) {

//        e1 and e2 both contains same data for Employee class
        Employee1 e1=new Employee1(100,"Gaurav","Uttarakhand");
        Employee1 e2=new Employee1(200,"Singh","Nainital");
        Employee1 e3=new Employee1(300,"Bora","Bageshwar");
        Employee1 e4=new Employee1(100,"Gaurav","Uttarakhand");

        Set<Employee1> h=new HashSet<>();
        h.add(e1);
        h.add(e2);
        h.add(e3);
        h.add(e4);

//here is the use of toString method -> it just creates hashCode for object and here we modified that how our hashcode will be created for objects;
        System.out.println(h);



//        because we have override and modified the hashCode()method  -> user defined hashCode
        System.out.println(" e1 hashcode :"+e1.hashCode());
        System.out.println(" e2 hashcode :"+e2.hashCode());
        System.out.println(" e3 hashcode :"+e3.hashCode());
        System.out.println(" e4 hashcode :"+e4.hashCode());


        Iterator it=h.iterator();
        while ((it.hasNext())){
            Employee1 object=(Employee1) it.next();
            object.show();
        }

    }
}
