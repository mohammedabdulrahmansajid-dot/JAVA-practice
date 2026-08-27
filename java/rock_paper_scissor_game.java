import java.util.Scanner;
public class rock_paper_scissor_game {
    public static void  main(String[] args){

   System.out.println("Lets play rock paper scissor!!\n So lets Start!!");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter rock, paper or scissor"); 
   String a = sc.next();
   System.out.println("Computer choosed paper");
   if (a.equals("paper") ){
    System.out.println("It is a draw");
   }
   
   else if(a.equals("rock")){
       System.out.println("Computer won");
   }
   else if(a.equals("scissor")){
    System.out.println("You won");
   }






}
}
