import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<String,String> hm=new Hashtable<>();
        hm.put("555","gaurav");
        hm.put("444","singh");
        hm.put("222","bora");
        hm.put("888","added");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey("34"));
        System.out.println(hm.containsKey("888"));
        System.out.println(hm.containsValue("bora"));
        System.out.println(hm.get("222"));


        Set sk=hm.keySet();
        Iterator it=sk.iterator();
        System.out.println("********Keys are-> ********");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\n ********Values are-> ********");
        Collection cl=hm.values();
        Iterator it1=cl.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        Set se=hm.entrySet();
        Iterator etr=se.iterator();
        System.out.println("\n ********Entries are ********");
        while(etr.hasNext()){
            System.out.println(etr.next());
        }
    }
}