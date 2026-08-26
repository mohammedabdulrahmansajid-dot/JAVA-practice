import java.util.Scanner;
public class switch_practice{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age");
     int a = sc.nextInt();
     switch (a) {

      case 8:
      System.out.println("You need vaccination");
     break;

     case 50:
     System.out.println("You need full body checkup");
     break;

     default:
     System.out.println("You Good");
     }





    }
}
