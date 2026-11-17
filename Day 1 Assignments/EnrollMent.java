import java.util.*;


public class EnrollMent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //In this stack is used to keep track of learners enrolled in a course.using stack we can easily pop the last enrollment 
        //While using queue we can only remove the first enrollment and we cannot access the last enrollment directly.
        Deque<String> learners = new ArrayDeque<>();
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter learner's name: ");
                    String name = sc.nextLine();
                    learners.push(name);
                    System.out.println("Enrolled: " + name);
                    break;

                case 2:
                    if (learners.isEmpty()) {
                        System.out.println("Nothing to undo.");
                    } else {
                        System.out.println("Undone: " + learners.pop());
                    }
                    break;

                case 3:
                    if (learners.isEmpty()) {
                        System.out.println("No enrollments available.");
                    } else {
                        System.out.println("Last enrollment: " + learners.peek());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
