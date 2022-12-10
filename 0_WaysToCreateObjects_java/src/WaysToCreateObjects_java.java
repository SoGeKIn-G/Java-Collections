import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    1- using new Keyword
    2- Using new instance
    3- Using clone() method
    4- Using newInstance() method of the constructor class
     */
class WaysToCreateObject {
    String name = "Gaurav Singh Bora";

    //  for method 3
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//       1- using new Keyword
        WaysToCreateObject firstObj = new WaysToCreateObject();
        System.out.println("firstObject hashcode :" + firstObj); //will run toString() method
        System.out.println(firstObj.name);


//         2- Using new instance
        try {
            Class cls = Class.forName("WaysToCreateObject");
//            creating object of main class using instance method
            WaysToCreateObject secondObj = (WaysToCreateObject) cls.newInstance();
            System.out.println("secondObject hashcode :" + secondObj);
            System.out.println(secondObj.name);


        } catch (Exception e) {
            e.printStackTrace();
        }


//        3- Using clone() method
        WaysToCreateObject temp = new WaysToCreateObject();
        try {   //using clone() method
            WaysToCreateObject thirdObject = (WaysToCreateObject)temp.clone();
            System.out.println("thirdObject hashcode :" + thirdObject);
            System.out.println(thirdObject.name);

        } catch (Exception e) {
            e.printStackTrace();
        }


//      4- Using newInstance() method of the constructor class
        try {
            Constructor<WaysToCreateObject> constructor = WaysToCreateObject.class.getDeclaredConstructor();
            WaysToCreateObject fourthObject = constructor.newInstance();
            System.out.println("fourthObject hashcode :" + fourthObject);
            System.out.println(fourthObject.name);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}