import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        System.out.println("----- STUDENT RECORD -----");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID of Student No. 1: ");
        int a1 = sc.nextInt();
        System.out.print("Enter Name of Student No. 1: ");
        String b1 = sc.next();
        System.out.print("Enter Grades of Student No. 1: ");
        int c1 = sc.nextInt();

        System.out.print("Enter ID of Student No. 2: ");
        int a2 = sc.nextInt();
        System.out.print("Enter Name of Student No. 2: ");
        String b2 = sc.next();
        System.out.print("Enter Grades of Student No. 2: ");
        int c2 = sc.nextInt();

        System.out.print("Enter ID of Student No. 3: ");
        int a3 = sc.nextInt();
        System.out.print("Enter Name of Student No. 3: ");
        String b3 = sc.next();
        System.out.print("Enter Grades of Student No. 3: ");
        int c3 = sc.nextInt();

        int[] id = {a1, a2, a3};
        String[] name = {b1, b2, b3};
        int[] grades = {c1, c2, c3};

        System.out.println("\n----- STUDENT DETAILS -----");

        for (int i = 0; i < id.length; i++) {
            System.out.println(
                "ID: " + id[i] +
                " Name: " + name[i] +
                " Grades: " + grades[i]
            );
        }


    }
}