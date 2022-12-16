import java.util.Comparator;

public class bi_Comparator_IdComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee1 obj1= (Employee1)o1;
        Employee1 obj2= (Employee1)o2;
        if(obj1.id>obj2.id){
            return 1;
        }
        else if(obj1.id<obj2.id){
            return -1;
        }
        return 0;
    }
}
