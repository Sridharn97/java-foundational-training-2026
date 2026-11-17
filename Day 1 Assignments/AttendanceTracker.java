public class AttendanceTracker {
    public static void main(String[] args) {
        int[] attendance = {45, 50, 48, 52, 40, 49, 55, 47, 51, 53};
        int n = attendance.length;
        int[] runningTotal = new int[n + 1];
        // We are using dp to store the running total of attendance for each day
        for (int i = 1; i <= n; i++) { //The loop iterates through the attendance array and calculates the running total by adding the current day's attendance to the previous day's running total.
            runningTotal[i] = runningTotal[i - 1] + attendance[i - 1];// This allows us to  calculate the total attendance for any particular range of days by subtracting the running total at the start day from the running total at the end day
        }
        int startDay = 3;
        int endDay = 7;      
        int total = runningTotal[endDay] - runningTotal[startDay - 1];
        System.out.println("Total: " + total);

        //We are using Brute Force to find the day with the highest attendance. We iterate through the attendance array and keep track of the maximum attendance and the corresponding day. Finally, we print the day with the highest attendance.    
        int maxAttendance = attendance[0];
        int maxDay = 1;
        for (int i = 1; i < n; i++) {
            if (attendance[i] > maxAttendance) {
                maxAttendance = attendance[i];
                maxDay = i + 1;
            }
        }
        System.out.println("Highest day: " + maxDay);
    }
}