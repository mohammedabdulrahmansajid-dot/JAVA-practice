import java.util.Scanner;

public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("****MENU****");
            System.out.println(" Enter 1 to play");
            System.out.println("Enter 2 to exit");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Lets play rock paper scissor!!\n So lets Start!!");
                System.out.println("Enter rock, paper or scissor");
                String a = sc.next();
                random()
                System.out.println("Computer choosed paper");
                if (a.equals("paper")) {
                    System.out.println("It is a draw");
                }

                else if (a.equals("rock")) {
                    System.out.println("Computer won");
                } else if (a.equals("scissor")) {
                    System.out.println("You won");
                } else if (n == 2) {
                    System.out.print("Exiting....");
                    return;

                } else {
                    System.out.println("Wrong choice entered, try again");
                }

            }

        }

    }
}
