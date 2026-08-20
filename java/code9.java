import java.util.Scanner;
public class code9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an integer");
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
