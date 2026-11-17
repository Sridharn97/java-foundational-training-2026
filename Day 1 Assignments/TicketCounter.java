
import java.util.*;

public class TicketCounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Users to Book the Tickets");
        int n=sc.nextInt();
        sc.nextLine();
        Queue<String> qu = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the Name of the User");
            String name=sc.nextLine();
            qu.offer(name);
        }
        System.out.println("Number of Members in Queue "+qu.size());
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu.peek());

    }
}