import java.util.Scanner;

public class question{

    public static void main(String[] args) {

        int[] num = {34, 45, 95, 75, 8439, 1};

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (a == num[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("This number is present");
        } 
        else {
            System.out.println("This number is not present");
        }
    }
}














    
