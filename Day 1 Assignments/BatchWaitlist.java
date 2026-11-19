import java.util.*;

class Main {
    public static void main(String[] args) {
        String seats[] = {"Asha", "Ravi", "Meena"};
        Queue<String> q = new LinkedList<String>();
        q.add("Kiran");
        q.add("Pooja");

        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + q);

        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equals("Ravi")) {

                if (!q.isEmpty()) {
                    seats[i] = q.remove();
                } else {
                    seats[i] = null;
                }
                break;
            }
        }

        System.out.println("After dropout:");
        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + q);
    }
}