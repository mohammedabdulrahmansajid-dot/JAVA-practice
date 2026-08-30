public class multidimensional_arrays{
    public static void main(String[] args){
    int [] [] scores = new int [4] [2];
    scores [0] [0] = 3;
    scores [0] [1] = 5;
    scores [1] [0] = 33;
    scores [1] [1] = 6;
    scores [2] [0] = 35;
    scores [2] [1] = 76;
    scores [3] [0] = 865;
    scores [3] [1] = 365;

   // System.out.println(scores[2] [1]);
   //System.out.println(scores.length);
   for(int i = 0; i<scores.length; i++){
    for(int j = 0; j<scores[i].length; j++){
        System.out.print(scores [i] [j]);
        System.out.print(" ");
    }
    System.out.println("");
   }
   

    
    






    }
}