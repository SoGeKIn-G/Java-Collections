import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push("one");
        stack.push(2);
        stack.push(true);
        stack.push("a");
        stack.push(567);
        stack.push(5.8);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.peek());

//        go to documentation for more details

    }
}