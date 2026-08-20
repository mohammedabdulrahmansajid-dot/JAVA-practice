import java.util.Scanner;

public class code8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter subject 2 marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter subject 3 marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter subject 4 marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter subject 5 marks");
        int sub5 = sc.nextInt();
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = sum/5.0f;
        System.out.println(" The percentage is");
        System.out.println(percentage);
    }
}
