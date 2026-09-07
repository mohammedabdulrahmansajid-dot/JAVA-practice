import java.util.Scanner;
public class project2 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] marks = new int[5];
int sum = 0;
int highest = 0;
int lowest = 100;
int passed = 0;
        

        // Input marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Process marks
        for (int i = 0; i < marks.length; i++) {

            sum = sum + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 40) {
                passed++;
            }
        }

        double average = (double) sum / marks.length;

        // Output
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks = " + sum);
        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);
        System.out.println("Students Passed = " + passed);

    }
}