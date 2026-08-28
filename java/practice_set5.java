public class practice_set5 {
    public static void main(String[] args) {

        // PROBLEM 1
        // for(int a = 4 ; a>0; a-- ){
        // for(int j = 0; j<a; j++){
        // System.out.print("*");

        // }
        // System.out.print("\n");
        // }

        // problem 2

        // int a = 1;
        // int sum =0;

        // while(a<7){

        // sum=sum+2*a;
        // a++;
        // }

        // System.out.println(sum);

        // PROBLEM 3
        // System.out.println("Multiplication Table of 3");

        // for(int a = 1; a<11; a++){
        // for(int b = 1; b< 11; b++){
        // System.out.println(a + "x" +b+ "="+ a*b);
        // }
        // }

        // PROBLEM 4

        // for(int a = 10; a>0; a--){
        // System.out.println("10 X " + a + "=" + 10*a);
        // }

        // PROBLEM 5
        // int product = 1;
        // for(int a = 5; a>0; a--){
        // product = product * a;
        // }
        // System.out.println(product);

        // PROBLEM 6

        // int a = 5;
        // int pro = 1;
        // while(a>0){
        // pro = pro * a;
        // a--;
        // }
        // System.out.println(pro);

        // PROBLEM 7:

        int a = 0;
        int b = 0;
        while (a < 5) {
            while (b < 5 - a) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
            b=0;
        }

    }
}
