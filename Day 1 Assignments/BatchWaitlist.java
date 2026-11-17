import java.util.*;
public class BatchWaitlist {
    public static void main(String[] args) {
        String[] seats = new String[3];
        Queue<String> waitlist = new LinkedList<>();
        String[] incoming = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};
        for (String name : incoming) {
            boolean placed = false;
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == null) {
                    seats[i] = name;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                waitlist.add(name);
            }
            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        }
        String drop = "Ravi";
        boolean found = false;
        for (int i = 0; i < seats.length; i++) {
            if (drop.equals(seats[i])) {
                if (!waitlist.isEmpty()) {
                    seats[i] = waitlist.poll();
                } else {
                    seats[i] = null;
                }
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Seats: " + Arrays.toString(seats));
            System.out.println("Waiting: " + waitlist);
        } else {
            System.out.println(drop + " is not in the batch");
        }
    }
}