import java.util.Scanner;
public class practice_set4{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // Problem 2
   /*System.out.println("Enter marks of Maths");
    int a = sc.nextInt();
    System.out.println("Enter marks of Chemistry");
    int b = sc.nextInt();
    System.out.println("Enter marks of Physics");
    int c = sc.nextInt();
    int d = (a + b + c)/3;
    boolean b1 = a > 33;
    boolean b2 = b > 33;
    boolean b3 = c > 33;
    
    if (b1 & b2 & b3 == true && d>40){
       System.out.println("PASS");
    }
   else{
    System.out.println("FAIL");
   }*/

// Problem 3

/*System.out.println("Enter your income");
float a = sc.nextFloat();
float b = a*0.05f;
float c = a*0.20f;
float d = a*0.30f;
if (a>250000 && a<500000){
    System.out.printf("You have to pay %f as a tax" , b);
}
else if (a>500000 && a<1000000){
    System.out.printf("You have to pay %f as a tax" , c);
}
else if(a>1000000){
    System.out.printf("You have to pay %f as a tax" , d);
}

else {
  System.out.printf("You have to pay no tax!!!");
}
*/

// Problem 5

/*System.out.println("Enter a year");
int a = sc.nextInt();
if (a % 4 == 0){
    System.out.println("Leap year");

}
else{
    System.out.println("Not a leap year");
}*/

// Problem 6

System.out.println("Enter the website name");
String s = sc.next();
if (s.endsWith(".org")){
    System.out.println("It is an organisation website");
} 
else if(s.endsWith(".com")){
    System.out.println("It is a commercial website");
}




}
}

