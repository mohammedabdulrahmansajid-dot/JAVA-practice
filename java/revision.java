import java.util.Scanner;

public class revision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of values you would like into an array:");
        int a = sc.nextInt();

        System.out.println("Noted!");

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.printf("Enter the %d element in the array: ", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.println("Therefore, the elements of the array are as follows:");

        for (int j = 0; j < a; j++) {
            System.out.println(arr[j]);
        }

        sc.close();
    }
}