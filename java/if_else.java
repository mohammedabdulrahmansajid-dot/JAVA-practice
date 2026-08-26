import java.util.Scanner;

public class if_else {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks");
    int a = sc.nextInt();
    if (a>90){
        System.out.println("Excellent");
    }
    else if (a>80){
        System.out.println("Good");

    }
    else if (a > 50){
        System.out.println("Do better next time");
    }
    else {
        System.out.println("FAIL");
    }




     
    }   
}
