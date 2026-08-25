import java.util.Scanner;

public class code15 {
   public code15() {
   }

   public static void main(String[] var0) {
      System.out.println("Taking Input From The User");
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter number 1");
      int var2 = var1.nextInt();
      System.out.println("Enter number 2");
      int var3 = var1.nextInt();
      int var4 = var2 + var3;
      System.out.println(" The sum of these numbers are ");
      System.out.println(var4);
   }
}

