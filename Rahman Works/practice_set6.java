//import java.util.Scanner;
public class practice_set6{
    public static void main(String[] args){
     // problem 1:
    // float [] data = { 1.2f, 3.6f, 9.8f, 7.8f, 9.7f};
       //Method 1:
    //    float sum = 0;
    //    for(int i = 0; i<data.length; i++){
    //     sum = sum + data[i];
       
    //    }

    //     System.out.println(sum);

      // Method 2
   // System.out.println(data[0] + data[2] + data[3] + data[4] +data[1]);

   // Problem 2:

//    int [] num = {34 ,45, 95, 75, 8439, 1};
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter a number:");
//    int a = sc.nextInt();
//    boolean b = false;
//    for(int i = 0; i<num.length; i++){
//       if(a == num[i]){
//          b = true;
//          break;
//       }
//    }
// if (b == true){
//    System.out.println("The no. is present");
// }
// else{
//    System.out.println("The no. is not present");
// }
   
   // PROBLEM 3: 
   int [] marks = {89, 95, 67, 56, 99};
   int sum = 0;
   for(int i= 0; i<marks.length; i++){
      sum = sum + marks[i];
   }
   float b = (float)(sum)/(marks.length);
   System.out.printf("The average of students in physics is %f", b);


   
























    }
}