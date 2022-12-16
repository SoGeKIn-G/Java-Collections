public class HashCodeDemo {
    public static void main(String[] args) {

        HashCodeDemo d = new HashCodeDemo();
        System.out.println("Hashcode of object d with class  Name is :" + d);

        int i = d.hashCode();// integer value that is created when the object created
        System.out.println("Crated unique integer for object is :" + i);

        String s = Integer.toHexString(i);
        System.out.println("Hexadecimal equivalent of integer is : " + s);


        Class c = d.getClass(); //return object of class 'Class'
        System.out.println(c); // o/p -> class HashCodeDemo
//        upper two lines shows that the object d is a instance of class 'Class'

        System.out.println(c.getName()); // o.p-> HashCodeDemo


        //        final hashcode creation
        System.out.println("\n Final Hashcode Creation :" + c.getName() + "@" + s);

    }
}