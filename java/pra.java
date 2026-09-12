import java.util.Scanner;

public class pra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        display(marks);
        int total = totalMarks(marks);
        int highest = highestMarks(marks);

        System.out.println("Total = " + total);
        System.out.println("Highest = " + highest);
    }

    static void display(int[] marks) {
        System.out.println("Marks are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }

    static int totalMarks(int[] marks) {
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        return total;
    }

    static int highestMarks(int[] marks) {
        int highest = marks[0];

        for (int i = 1; i < 5; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }
}