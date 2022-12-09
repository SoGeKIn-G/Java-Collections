interface Polygon1 {
    public void display();
}

class AnonymousDemo1 {
    public void createClass() {
        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.1");
            }
        };
        p1.display();
    }
}


public class AC_Implementing_Interface {
    public static void main(String[] args) {
        AnonymousDemo1 an = new AnonymousDemo1();
        an.createClass();
    }


}
