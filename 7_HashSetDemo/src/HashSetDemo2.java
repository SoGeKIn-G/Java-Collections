import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
    int id;
    String name,address;

    Employee(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void show() {
        System.out.println(id+" "+name+" "+address);
    }
}


public class HashSetDemo2 {
    public static void main(String[] args) {

//        e1 and e2 both contains same data for Employee class
        Employee e1=new Employee(100,"Gaurav","Uttarakhand");
        Employee e2=new Employee(200,"Singh","Nainital");
        Employee e3=new Employee(300,"Bora","Bageshwar");
        Employee e4=new Employee(100,"Gaurav","Uttarakhand");

        Set<Employee> h=new HashSet<>();
        h.add(e1);
        h.add(e2);
        h.add(e3);
        h.add(e4);

//        but both e1 and e4 will be added into the set because e1 and e4 both are objects and they have different hashcode , Set does not have anything to do with the Employee class data the only thing that matter is the  hashcode of the objects that are going into Set directly

        //        using this println line you can see the different hashcode  for all objects
        System.out.println(h);


        Iterator it=h.iterator();
        while ((it.hasNext())){
            Employee object=(Employee) it.next();
           object.show();
        }

    }
}
