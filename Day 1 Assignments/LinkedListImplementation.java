import java.util.*;

public class LinkedListImplementation {
       public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Removed: " + linkedList.poll());
        System.out.println("After poll(): " + linkedList);
        System.out.println("First element: " + linkedList.peek());
    }
}

